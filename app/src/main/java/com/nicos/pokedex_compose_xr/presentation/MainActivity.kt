package com.nicos.pokedex_compose_xr.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.xr.compose.spatial.Subspace
import androidx.xr.compose.subspace.SpatialPanel
import androidx.xr.compose.subspace.layout.SubspaceModifier
import androidx.xr.compose.subspace.layout.height
import androidx.xr.compose.subspace.layout.movable
import androidx.xr.compose.subspace.layout.resizable
import androidx.xr.compose.subspace.layout.width
import com.nicos.pokedex_compose_xr.presentation.navigation.Navigation
import com.nicos.pokedex_compose_xr.ui.theme.Pokedex_Compose_XRTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pokedex_Compose_XRTheme {
                Subspace {
                    SpatialPanel(
                        SubspaceModifier
                            .height(824.dp)
                            .width(1400.dp)
                            .movable()
                            .resizable()
                    ) {
                        Scaffold(
                            modifier = Modifier.fillMaxSize(),
                            contentColor = MaterialTheme.colorScheme.background,
                        ) { innerPadding ->
                            Navigation({ enableEdgeToEdge() })
                        }
                    }
                }
            }
        }
    }
}