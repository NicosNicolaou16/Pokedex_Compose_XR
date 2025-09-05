package com.nicos.pokedex_compose_xr.domain.models.pokemon_response_model

import com.google.gson.annotations.SerializedName
import com.nicos.pokedex_compose_xr.domain.dto.PokemonDto

data class PokemonResponse(
    @SerializedName("next") val nextUrl: String?,
    @SerializedName("results") val results: MutableList<PokemonDto>
) {
}