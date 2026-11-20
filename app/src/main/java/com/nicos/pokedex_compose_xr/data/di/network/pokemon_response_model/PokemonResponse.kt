package com.nicos.pokedex_compose_xr.data.di.network.pokemon_response_model

import com.nicos.pokedex_compose_xr.data.dto.PokemonDto
import kotlinx.serialization.SerialName

data class PokemonResponse(
    @SerialName("next") val nextUrl: String?,
    @SerialName("results") val results: MutableList<PokemonDto>
) {
}