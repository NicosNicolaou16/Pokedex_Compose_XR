package com.nicos.pokedex_compose_xr.domain.repositories

import com.nicos.pokedex_compose.data.room_database.entities.PokemonEntity
import com.nicos.pokedex_compose.utils.generic_classes.Resource
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonEntity

interface PokemonListRepository {
    suspend fun fetchPokemonList(url: String?): Resource<MutableList<PokemonEntity>>
    suspend fun savePokemon(pokemonEntityList: MutableList<PokemonEntity>)
    suspend fun offline(): Resource<MutableList<PokemonEntity>>
}