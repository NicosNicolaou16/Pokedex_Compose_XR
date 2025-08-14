package com.nicos.pokedex_compose_xr.domain.repositories

import com.nicos.pokedex_compose_xr.utils.generic_classes.Resource
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonEntity
import kotlinx.coroutines.flow.Flow

interface PokemonListRepository {
    suspend fun fetchPokemonList(url: String?): Flow<Resource<MutableList<PokemonEntity>>>
    suspend fun savePokemon(pokemonEntityList: MutableList<PokemonEntity>)
    suspend fun offline(): Flow<Resource<MutableList<PokemonEntity>>>
}