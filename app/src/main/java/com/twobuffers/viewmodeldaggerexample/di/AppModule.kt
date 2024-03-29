/*
 * Copyright 2019 Two Buffers Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package com.twobuffers.viewmodeldaggerexample.di

import android.app.Application
import com.twobuffers.base.di.ApplicationScoped
import com.twobuffers.viewmodeldaggerexample.App
import dagger.Binds
import dagger.Module

/**
 * Dagger module for the AppComponent
 */
@Module(includes = [
    BuildConfigModule::class,
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
