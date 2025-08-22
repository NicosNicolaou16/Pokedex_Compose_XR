package com.nicos.pokedex_compose_xr.data.repository_impl

import com.nicos.pokedex_compose_xr.data.mappers.toPokemonDetailsUi
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonDetailsEntity
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonDetailsWithStatsEntity
import com.nicos.pokedex_compose_xr.data.room_database.init_database.MyRoomDatabase
import com.nicos.pokedex_compose_xr.domain.models.models.PokemonDetailsUI
import com.nicos.pokedex_compose_xr.domain.network.PokemonService
import com.nicos.pokedex_compose_xr.domain.repositories.PokemonDetailsRepository
import com.nicos.pokedex_compose_xr.utils.generic_classes.HandlingError
import com.nicos.pokedex_compose_xr.utils.generic_classes.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PokemonDetailsRepositoryImpl @Inject constructor(
    private val myRoomDatabase: MyRoomDatabase,
    private val pokemonService: PokemonService,
    private val handlingError: HandlingError,
) : PokemonDetailsRepository {

    override suspend fun fetchPokemonDetails(
        url: String,
        name: String
    ): Flow<Resource<PokemonDetailsUI>> {
        return flow {
            try {
                val pokemonDetails = pokemonService.getPokemonDetails(url = url)
                savePokemonDetails(pokemonDetailsEntity = pokemonDetails)
                val pokemonDetailsEntity: PokemonDetailsWithStatsEntity? =
                    PokemonDetailsEntity.getPokemonDetails(name, myRoomDatabase)
                emit(Resource.Success(data = pokemonDetailsEntity?.toPokemonDetailsUi()))
            } catch (e: Exception) {
                emit(Resource.Error(message = handlingError.handleErrorMessage(e)))
            }
        }.flowOn(Dispatchers.IO)
    }

    override suspend fun savePokemonDetails(pokemonDetailsEntity: PokemonDetailsEntity) =
        PokemonDetailsEntity.savePokemonDetails(
            pokemonDetailsEntity = pokemonDetailsEntity,
            myRoomDatabase = myRoomDatabase
        ).collect()

    override suspend fun offline(name: String): Flow<Resource<PokemonDetailsUI>> {
        return flow {
            try {
                val pokemonDetailsEntity: PokemonDetailsWithStatsEntity? =
                    PokemonDetailsEntity.getPokemonDetails(name, myRoomDatabase)
                emit(Resource.Success(data = pokemonDetailsEntity?.toPokemonDetailsUi()))
            } catch (e: Exception) {
                emit(Resource.Error(message = handlingError.handleErrorMessage(e)))
            }
        }.flowOn(Dispatchers.IO)
    }
}