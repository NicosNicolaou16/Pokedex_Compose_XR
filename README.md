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

## Versioning

Target SDK version: 36 <br />
Minimum SDK version: 29 <br />
Kotlin version: 2.2.0 <br />
Gradle version: 8.12.0 <br />

## References/Tutorials Follow

https://developer.android.com/develop/xr/jetpack-xr-sdk/develop-ui <br />
https://android-developers.googleblog.com/2024/12/introducing-android-xr-sdk-developer-preview.html <br />