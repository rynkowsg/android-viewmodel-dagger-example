@file:Suppress("unused")

package com.twobuffers.example.notificationpanel.di

import android.app.Application
import com.twobuffers.example.di.ApplicationScoped
import com.twobuffers.example.notificationpanel.App
import dagger.Binds
import dagger.Module

/**
 * Dagger module for the AppComponent
 */
@Module(includes = [
    BuildConfigModule::class,
    AppCommonModule::class,
    AppModule.BindingModule::class
])
class AppModule {

    @Module
    abstract class BindingModule {
        @Binds
        @ApplicationScoped
        abstract fun bindApplication(instance: App): Application
    }
}