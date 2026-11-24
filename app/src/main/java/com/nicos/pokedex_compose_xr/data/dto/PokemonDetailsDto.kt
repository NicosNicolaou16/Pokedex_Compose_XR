package com.nicos.pokedex_compose_xr.data.dto

import kotlinx.serialization.SerialName

data class PokemonDetailsDto(
    val name: String,
    @SerialName("stats") var statsEntity: MutableList<StatsDto>?,
    val weight: Int?
)
