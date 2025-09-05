package com.nicos.pokedex_compose_xr.presentation.pokemon_details_screen.models

import com.nicos.pokedex_compose_xr.data.room_database.entities.StatsEntity

data class PokemonDetailsUI(
    val name: String,
    val stats: MutableList<StatsEntity>,
    val weight: Int,
)
