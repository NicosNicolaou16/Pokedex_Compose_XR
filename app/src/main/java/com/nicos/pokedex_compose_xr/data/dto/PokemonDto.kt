package com.nicos.pokedex_compose_xr.data.dto

data class PokemonDto(
    val name: String,
    val url: String?,
    var imageUrl: String?,
    var order: Int?,
)
