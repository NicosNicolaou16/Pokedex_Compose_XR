package com.nicos.pokedex_compose_xr.domain.repositories

import com.nicos.pokedex_compose_xr.data.mappers.PokemonUi
import com.nicos.pokedex_compose_xr.utils.generic_classes.Resource
import kotlinx.coroutines.flow.Flow

interface PokemonListRepository {
    suspend fun fetchPokemonList(url: String?): Flow<Resource<MutableList<PokemonUi>>>
    suspend fun offline(): Flow<Resource<MutableList<PokemonUi>>>
}