package com.nicos.pokedex_compose_xr.domain.repositories

import com.nicos.pokedex_compose_xr.data.mappers.PokemonDetailsUI
import com.nicos.pokedex_compose_xr.utils.generic_classes.Resource
import kotlinx.coroutines.flow.Flow

interface PokemonDetailsRepository {
    suspend fun fetchPokemonDetails(url: String, name: String): Flow<Resource<PokemonDetailsUI>>
    suspend fun offline(name: String): Flow<Resource<PokemonDetailsUI>>
}