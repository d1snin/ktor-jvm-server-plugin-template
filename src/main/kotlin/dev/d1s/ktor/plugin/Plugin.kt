/*
 * Copyright 2022 Mikhail Titov
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

package dev.d1s.ktor.plugin

import io.ktor.server.application.*

/**
 * A plugin that does something.
 */
public val Plugin: ApplicationPlugin<PluginConfig> = createApplicationPlugin("plugin", ::PluginConfig) {
    TODO()
}

/**
 * [dev.d1s.ktor.plugin.Plugin] config.
 */
public class PluginConfig {
    // TODO
}