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

package com.twobuffers.example.ui.example_4_injected_mvrx_2

import com.twobuffers.common.mvi.MviIntent

sealed class InjectedMvrx2Intent : MviIntent {
    object ScreenInitialising : InjectedMvrx2Intent()
    object ErrorToastShown : InjectedMvrx2Intent()
}
