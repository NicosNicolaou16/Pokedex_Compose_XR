package com.nicos.pokedex_compose_xr.data.mappers

import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonDetailsEntity
import com.nicos.pokedex_compose_xr.domain.models.models.PokemonDetailsUI

fun PokemonDetailsEntity.toPokemonDetailsUi(): PokemonDetailsUI {
    return PokemonDetailsUI(
        name = this.name,
        stats = this.statsEntity ?: mutableListOf(),
        weight = this.weight ?: 0,
    )
}

fun PokemonDetailsUI.toPokemonDetailsEntity(): PokemonDetailsEntity {
    return PokemonDetailsEntity(
        name = this.name,
        statsEntity = this.stats,
        weight = this.weight,
    )
}
