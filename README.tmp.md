[//]: # ([![]&#40;https://jitpack.io/v/dev.d1s/ktor-jvm-server-plugin-template.svg&#41;]&#40;https://jitpack.io/#dev.d1s/ktor-jvm-server-plugin-template&#41;)

### Plugin

Plugin description.

### Installation

```kotlin
repositories {
    maven(url = "https://jitpack.io")
}

dependencies {
    val ktorJvmServerPluginTemplateVersion: String by project

    implementation("dev.d1s:ktor-jvm-server-plugin-template:$ktorJvmServerPluginTemplateVersion")
}
```

### Usage

```kotlin
fun Application.configureSomething() {
    install(Plugin) {
        TODO()
    }
}
```

### Code of Conduct

See [CODE_OF_CONDUCT.md](./CODE_OF_CONDUCT.md)

### How to contribute

See [CONTRIBUTING.md](./CONTRIBUTING.md)

### License

```
Copyright 2022 Mikhail Titov

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```