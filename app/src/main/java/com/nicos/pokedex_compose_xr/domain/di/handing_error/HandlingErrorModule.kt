package com.nicos.pokedex_compose_xr.domain.di.handing_error

import android.content.Context
import com.nicos.pokedex_compose_xr.utils.generic_classes.HandlingError
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object HandlingErrorModule {

    @Singleton
    @Provides
    fun getHandleError(@ApplicationContext context: Context) = HandlingError(context)
}