package com.nicos.pokedex_compose_xr.domain.dto

import com.google.gson.annotations.SerializedName

data class StatsDto(
    @SerializedName("base_stat") val baseStat: Int?,
    val stat: StatDto?,
    val pokemonName: String?,
) {
}