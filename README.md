# Pokedex Compose XR

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

## Versioning

Target SDK version: 36 <br />
Minimum SDK version: 29 <br />
Kotlin version: 2.2.0 <br />
Gradle version: 8.12.0 <br />

## References/Tutorials Follow

https://developer.android.com/develop/xr/jetpack-xr-sdk/develop-ui <br />
https://android-developers.googleblog.com/2024/12/introducing-android-xr-sdk-developer-preview.html <br />