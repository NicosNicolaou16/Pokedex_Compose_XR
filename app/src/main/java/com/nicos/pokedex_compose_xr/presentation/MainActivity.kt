package com.nicos.pokedex_compose_xr.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.nicos.pokedex_compose_xr.presentation.pokemon_list_screen.PokemonListScreen
import com.nicos.pokedex_compose_xr.ui.theme.Pokedex_Compose_XRTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pokedex_Compose_XRTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    contentColor = MaterialTheme.colorScheme.background,
                ) { innerPadding ->
                    PokemonListScreen({ enableEdgeToEdge() })
                }
            }
        }
    }
}