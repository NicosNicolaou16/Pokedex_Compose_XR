package com.nicos.pokedex_compose_xr.data.mappers

import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonDetailsEntity
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonDetailsWithStatsEntity
import com.nicos.pokedex_compose_xr.presentation.pokemon_details_screen.models.PokemonDetailsUI

fun PokemonDetailsWithStatsEntity.toPokemonDetailsUi(): PokemonDetailsUI {
    return PokemonDetailsUI(
        name = this.pokemonDetailsEntity.name,
        stats = this.statsEntityList,
        weight = this.pokemonDetailsEntity.weight ?: 0,
    )
}

fun PokemonDetailsUI.toPokemonDetailsEntity(): PokemonDetailsWithStatsEntity {
    return PokemonDetailsWithStatsEntity(
        pokemonDetailsEntity = PokemonDetailsEntity(
            name = this.name,
            weight = this.weight
        ),
        statsEntityList = this.stats
    )
}
