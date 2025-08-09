@file:OptIn(ExperimentalSharedTransitionApi::class)

package com.nicos.pokedex_compose_xr.presentation.pokemon_list_screen

import android.annotation.SuppressLint
import androidx.activity.SystemBarStyle
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.xr.compose.spatial.Subspace
import androidx.xr.compose.subspace.SpatialPanel
import androidx.xr.compose.subspace.SpatialRow
import androidx.xr.compose.subspace.layout.PlaneSemantic
import androidx.xr.compose.subspace.layout.SubspaceModifier
import androidx.xr.compose.subspace.layout.height
import androidx.xr.compose.subspace.layout.movable
import androidx.xr.compose.subspace.layout.resizable
import androidx.xr.compose.subspace.layout.width
import coil.compose.AsyncImage
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.nicos.pokedex_compose_xr.data.models.pokemon_details_data_model.SelectedPokemonModel
import com.nicos.pokedex_compose_xr.data.room_database.entities.PokemonEntity
import com.nicos.pokedex_compose_xr.presentation.generic_compose_views.CustomToolbar
import com.nicos.pokedex_compose_xr.presentation.generic_compose_views.ShowDialog
import com.nicos.pokedex_compose_xr.presentation.generic_compose_views.StartDefaultLoader
import com.nicos.pokedex_compose_xr.presentation.pokemon_details_screen.PokemonDetailsScreen
import com.nicos.pokedex_compose_xr.utils.extensions.getProgressDrawable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SharedTransitionScope.PokemonListScreen(
    navController: NavController,
    changeSystemBarStyle: (SystemBarStyle) -> Unit
) {
    var selectedPokemonModel by remember { mutableStateOf(SelectedPokemonModel()) }

    Subspace {
        SpatialRow(
            SubspaceModifier
                .height(1000.dp)
                .width(1500.dp)
                .movable()
                .resizable()
        ) {
            SpatialPanel(
                SubspaceModifier
                    .height(900.dp)
                    .width(500.dp)
            ) {
                Scaffold(topBar = {
                    CustomToolbar(
                        title = stringResource(com.nicos.pokedex_compose_xr.R.string.pokemon_list),
                    )
                }) { paddingValues ->
                    GridViewPokemonList(
                        paddingValues = paddingValues,
                        listener = {
                            selectedPokemonModel = SelectedPokemonModel(
                                url = it.url,
                                imageUrl = it.imageUrl,
                                name = it.name
                            )
                        },
                    )
                }
            }

            if (selectedPokemonModel.url != null &&
                selectedPokemonModel.imageUrl != null &&
                selectedPokemonModel.name != null
            ) {
                SpatialPanel(
                    SubspaceModifier
                        .height(1000.dp)
                        .width(700.dp)
                ) {
                    PokemonDetailsScreen(
                        url = selectedPokemonModel.url ?: "",
                        imageUrl = selectedPokemonModel.imageUrl ?: "",
                        name = selectedPokemonModel.name ?: "",
                        changeSystemBarStyle = changeSystemBarStyle,
                    )
                }
            }
        }
    }
}

@Composable
fun GridViewPokemonList(
    listener: (PokemonEntity) -> Unit,
    paddingValues: PaddingValues,
    pokemonListViewModel: PokemonListViewModel = hiltViewModel()
) {
    val state = pokemonListViewModel.pokemonListState.collectAsState().value
    if (!state.error.isNullOrEmpty()) ShowDialog(
        title = stringResource(id = com.nicos.pokedex_compose_xr.R.string.error),
        message = state.error
    )
    LazyVerticalGrid(
        modifier = Modifier.padding(top = paddingValues.calculateTopPadding()),
        columns = GridCells.Fixed(2)
    ) {
        items(state.pokemonMutableList ?: mutableListOf(), key = { pokemon ->
            pokemon.name
        }) { pokemon ->
            LoadPokemonImage(
                listener = listener,
                pokemonEntity = pokemon
            )
        }
        item {
            LaunchedEffect(key1 = true) {
                if (!state.nextPage.isNullOrEmpty()) pokemonListViewModel.requestToFetchPokemon(
                    state.nextPage
                )
            }
        }
    }
    if (state.isLoading) StartDefaultLoader()
}

@Composable
fun LoadPokemonImage(
    listener: (PokemonEntity) -> Unit,
    pokemonEntity: PokemonEntity
) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable {
                listener(pokemonEntity)
            },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        ),
        shape = RoundedCornerShape(20.dp),
        colors = CardColors(
            contentColor = colorResource(id = android.R.color.holo_green_light),
            containerColor = colorResource(id = android.R.color.holo_green_light),
            disabledContentColor = colorResource(id = android.R.color.holo_green_light),
            disabledContainerColor = colorResource(id = android.R.color.holo_green_light),
        )
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context = context).apply {
                data(pokemonEntity.imageUrl)
                placeholder(getProgressDrawable(context))
                error(android.R.drawable.stat_notify_error)
                fallback(android.R.drawable.stat_notify_error)
                memoryCachePolicy(CachePolicy.ENABLED)
            }.build(),
            modifier = Modifier
                .fillMaxSize(),
            contentDescription = null,
            contentScale = ContentScale.None,
        )
    }
}