package com.nicos.pokedex_compose_xr.domain.repositories

import com.nicos.pokedex_compose_xr.utils.generic_classes.Resource
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonDetailsEntity
import kotlinx.coroutines.flow.Flow

interface PokemonDetailsRepository {
    suspend fun fetchPokemonDetails(url: String, name: String): Flow<Resource<PokemonDetailsEntity>>
    suspend fun savePokemonDetails(pokemonDetailsEntity: PokemonDetailsEntity)
    suspend fun offline(name: String): Flow<Resource<PokemonDetailsEntity>>
}