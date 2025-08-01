package com.nicos.pokedex_compose_xr.presentation.pokemon_details_screen

import com.nicos.pokedex_compose_xr.data.models.pokemon_details_data_model.PokemonDetailsDataModel

data class PokemonDetailsState(
    val pokemonDetailsDataModelList: MutableList<PokemonDetailsDataModel>,
    val isLoading: Boolean = false,
    val error: String? = null,
)