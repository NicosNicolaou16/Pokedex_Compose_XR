package com.nicos.pokedex_compose_xr.data.di.repository_module

import com.nicos.pokedex_compose_xr.data.network.PokemonService
import com.nicos.pokedex_compose_xr.data.repository_impl.PokemonDetailsRepositoryImpl
import com.nicos.pokedex_compose_xr.data.repository_impl.PokemonListRepositoryImpl
import com.nicos.pokedex_compose_xr.data.room_database.init_database.MyRoomDatabase
import com.nicos.pokedex_compose_xr.domain.repositories.PokemonDetailsRepository
import com.nicos.pokedex_compose_xr.domain.repositories.PokemonListRepository
import com.nicos.pokedex_compose_xr.utils.generic_classes.HandlingError
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepositoriesModule {

    @Provides
    fun getPokemonListRepository(
        myRoomDatabase: MyRoomDatabase,
        pokemonService: PokemonService,
        handlingError: HandlingError
    ): PokemonListRepository {
        return PokemonListRepositoryImpl(
            myRoomDatabase,
            pokemonService,
            handlingError
        )
    }

    @Provides
    fun getPokemonDetailsRepository(
        myRoomDatabase: MyRoomDatabase,
        pokemonService: PokemonService,
        handlingError: HandlingError
    ): PokemonDetailsRepository {
        return PokemonDetailsRepositoryImpl(
            myRoomDatabase,
            pokemonService,
            handlingError
        )
    }
}