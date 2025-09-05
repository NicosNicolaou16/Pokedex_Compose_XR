package com.nicos.pokedex_compose_xr.domain.repositories

import com.nicos.pokedex_compose_xr.utils.generic_classes.Resource
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonDetailsEntity
import com.nicos.pokedex_compose_xr.presentation.pokemon_details_screen.models.PokemonDetailsUI
import kotlinx.coroutines.flow.Flow

interface PokemonDetailsRepository {
    suspend fun fetchPokemonDetails(url: String, name: String): Flow<Resource<PokemonDetailsUI>>
    suspend fun savePokemonDetails(pokemonDetailsEntity: PokemonDetailsEntity)
    suspend fun offline(name: String): Flow<Resource<PokemonDetailsUI>>
}