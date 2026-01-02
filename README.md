# Pokedex Compose XR

[![Linktree](https://img.shields.io/badge/linktree-1de9b6?style=for-the-badge&logo=linktree&logoColor=white)](https://linktr.ee/nicos_nicolaou)
[![Static Badge](https://img.shields.io/badge/Site-blue?style=for-the-badge&label=Web)](https://nicosnicolaou16.github.io/)
[![X](https://img.shields.io/badge/X-%23000000.svg?style=for-the-badge&logo=X&logoColor=white)](https://twitter.com/nicolaou_nicos)
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/nicos-nicolaou-a16720aa)
[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/@nicosnicolaou)
[![Mastodon](https://img.shields.io/badge/-MASTODON-%232B90D9?style=for-the-badge&logo=mastodon&logoColor=white)](https://androiddev.social/@nicolaou_nicos)
[![Bluesky](https://img.shields.io/badge/Bluesky-0285FF?style=for-the-badge&logo=Bluesky&logoColor=white)](https://bsky.app/profile/nicolaounicos.bsky.social)
[![Dev.to blog](https://img.shields.io/badge/dev.to-0A0A0A?style=for-the-badge&logo=dev.to&logoColor=white)](https://dev.to/nicosnicolaou16)
[![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)](https://www.youtube.com/@nicosnicolaou16)
[![Static Badge](https://img.shields.io/badge/Developer_Profile-blue?style=for-the-badge&label=Google)](https://g.dev/nicolaou_nicos)

Pokedex Compose XR is an open-source project that blends the charm of the Pokédex with cutting-edge
Extended Reality (XR) experiences, powered by Jetpack Compose. Built on top of the early-access
AndroidX XR library, it showcases how immersive Pokémon data visualization can work across AR and VR
devices.

Key features include:

- Immersive Pokémon browsing – View Pokémon models, stats, and details in a fully spatial
  environment.

- Compose-driven UI – Leverage the power of Jetpack Compose to create responsive, dynamic XR
  layouts.

- Interaction experiments – Test gesture controls, spatial navigation, and XR-native interface
  patterns.

- Extensible architecture – Replace datasets, plug in new XR hardware, or adapt it for other 3D
  catalog experiences.

Pokedex Compose XR is both a showcase and a playground for developers interested in building XR apps
with the AndroidX XR library, offering real-world examples to accelerate experimentation and
learning.

<p align="left">
  <a title="simulator_image"><img src="examples/Screenshot_20250810_024943.png" height="500" width="200"></a>
  <a title="simulator_image"><img src="examples/Screenshot_20250810_024956.png" height="500" width="200"></a>
  <a title="simulator_image"><img src="examples/example_gif1.gif" height="500" width="200"></a>
</p>

## How to Test Pokedex Compose XR

To run and experiment with Pokedex Compose XR, you’ll need:

1. The latest Canary build of Android Studio – for example, I’m currently using Android Studio
   Narwhal
   3 Feature Drop | 2025.1.3 Canary 4.

2. XR System Images for the XR Emulator – these are required to simulate the Extended Reality
   environment without physical hardware.

3. Clone this repository, open it in Android Studio, and select an XR Emulator device profile when
   launching the app.

This setup ensures you can explore the project as intended, leveraging the early-access AndroidX XR
library in a full virtual XR environment.

# The Project Contain the following technologies

Create spatial and immersive Android experiences
using [Jetpack XR](https://developer.android.com/develop/xr/jetpack-xr-sdk/develop-ui) and modern
Compose-based UI. <br />
The programming language is the [Kotlin](https://kotlinlang.org/docs/getting-started.html), it is a
modern, JVM-based programming language that is concise, safe, and interoperable with Java. <br />
[Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) is used for asynchronous
tasks. <br />
[Kotlin KTX](https://developer.android.com/kotlin/ktx) is a collection of Kotlin extensions that
offer more concise and expressive code for working with Android APIs and libraries.
The UI is build using [Jetpack Compose](https://developer.android.com/develop/ui/compose). <br />
[Retrofit](https://square.github.io/retrofit/) is responsible for making requests and retrieving
data from the remote server. ([Repository](https://github.com/square/retrofit)) <br />
[Room Database](https://developer.android.com/training/data-storage/room) is responsible for saving
the retrieved data from the remote server, querying data from the local database, and supporting
offline functionality.  <br />
[Palette](https://developer.android.com/develop/ui/views/graphics/palette-colors) is used to
retrieve the color from the image; in our case, we are using the Pokémon color to paint the linear
indicator with the same color. <br />
[KSP](https://developer.android.com/build/migrate-to-ksp) ("Kotlin Symbol Processing") is a tool for
efficient annotation processing in Kotlin, providing faster code generation and symbol manipulation
compared to KAPT. [Repository](https://github.com/google/ksp) <br />
[Coil](https://coil-kt.github.io/coil/compose/) for Jetpack Compose is a library that it is
responsible for loading the images
asynchronous. ([Coil Documentation](https://coil-kt.github.io/coil/), [Repository](https://github.com/coil-kt/coil)) <br />
[Hilt Dependencies Injection](https://developer.android.com/training/dependency-injection/hilt-android)
is an Android library that simplifies dependency injection by using annotations to automatically
manage and provide dependencies across components, built on top of
Dagger. ([Documentation](https://dagger.dev/hilt/)) <br />
[MVVM](https://developer.android.com/topic/architecture#recommended-app-arch) with repository is an
architecture where the Repository manages data sources (e.g., network, database), the ViewModel
processes the data for the UI, and the View displays the UI, ensuring a clear separation of
concerns. <br />
[UI State](https://developer.android.com/topic/architecture/ui-layer/events#handle-viewmodel-events)
to initial, loading, loaded and error. <br />
[R8](https://developer.android.com/build/shrink-code) enabled, is a code shrinker and obfuscator for
Android that optimizes and reduces the size of APKs by removing unused code and resources, while
also obfuscating the remaining code to improve security. <br />
The percentage for showing the skills of each Pokémon is calculated using
the [PercentageWithAnimation](https://github.com/NicosNicolaou16/PercentagesWithAnimationCompose)
built by [@NicosNicolaou16](https://github.com/NicosNicolaou16). <br />

## Versioning

XR Compose version: 1.0.0-alpha09 <br />
XR Runtime version: 1.0.0-alpha09 <br />
Material3 XR Compose version: 1.0.0-alpha13 <br />
XR Extensions version: 1.0.0 <br />
Target SDK version: 36 <br />
Minimum SDK version: 29 <br />
Kotlin version: 2.3.0 <br />
Gradle version: 8.13.2 <br />

## References/Tutorials Follow

https://developer.android.com/develop/xr/jetpack-xr-sdk/develop-ui <br />
https://android-developers.googleblog.com/2024/12/introducing-android-xr-sdk-developer-preview.html <br />