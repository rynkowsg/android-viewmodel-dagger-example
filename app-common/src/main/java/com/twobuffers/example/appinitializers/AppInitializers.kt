@file:Suppress("unused")

package com.twobuffers.example.appinitializers

import android.app.Application
import com.twobuffers.example.di.ApplicationScoped
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import javax.inject.Inject

@ApplicationScoped
class AppInitializers @Inject constructor(
    private val initializers: Set<@JvmSuppressWildcards AppInitializer>
) {
    fun init(application: Application) {
        initializers.forEach {
            it.init(application)
        }
    }

    @Module
    abstract class DiModule {
        @Binds
        @IntoSet
        @ApplicationScoped
        abstract fun bindTimberInitializer(bind: TimberInitializer): AppInitializer
    }
}
