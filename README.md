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

Pokedex Compose XR is an open-source project that blends the charm of the Pokédex with cutting-edge Extended Reality (XR) experiences, powered by Jetpack Compose. Built on top of the early-access AndroidX XR library, it showcases how immersive Pokémon data visualization can work across AR and VR devices.

<p align="left">
  <a title="simulator_image"><img src="examples/Screenshot_20250810_024943.png" height="500" width="200"></a>
  <a title="simulator_image"><img src="examples/Screenshot_20250810_024956.png" height="500" width="200"></a>
  <a title="simulator_image"><img src="examples/example_gif1.gif" height="500" width="200"></a>
</p>

## ✨ Key Features

*   **Immersive Pokémon Browsing:** View Pokémon models, stats, and details in a fully spatial environment.
*   **Compose-Driven UI:** Leverage the power of Jetpack Compose to create responsive, dynamic XR layouts.
*   **Interaction Experiments:** Test gesture controls, spatial navigation, and XR-native interface patterns.
*   **Extensible Architecture:** Designed to be easily adapted for other 3D catalog experiences by replacing datasets or integrating new XR hardware.

Pokedex Compose XR is both a showcase and a playground for developers interested in building XR apps with the AndroidX XR library, offering real-world examples to accelerate experimentation and learning.

## 🔧 How to Test

To run and experiment with Pokedex Compose XR, you’ll need:

1.  **The latest Canary build of Android Studio** (e.g., Android Studio Narwhal 3 Feature Drop | 2025.1.3 Canary 4).
2.  **XR System Images for the Android Emulator** to simulate an Extended Reality environment without physical hardware.
3.  **Clone this repository**, open it in Android Studio, and select an XR Emulator device profile to launch the app.

This setup ensures you can explore the project as intended in a full virtual XR environment.

## 🛠️ Tech Stack & Core Technologies

This project is built using modern, recommended technologies for creating spatial and immersive Android experiences.

*   **UI & Spatialization**:
    *   **[Jetpack Compose for XR](https://developer.android.com/develop/xr/jetpack-xr-sdk/develop-ui)**: A declarative UI toolkit for building native, spatial user interfaces in XR.
    *   **[Palette API](https://developer.android.com/develop/ui/views/graphics/palette-colors)**: Extracts prominent colors from Pokémon images to dynamically theme UI components.
    *   **[Coil](https://coil-kt.github.io/coil/compose/)**: A lightweight, modern image loading library for Android backed by Kotlin Coroutines.

*   **Core Architecture & Language**:
    *   **[Kotlin](https://kotlinlang.org/docs/getting-started.html)**: The primary programming language, offering concise, safe, and modern syntax.
    *   **[Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [KTX](https://developer.android.com/kotlin/ktx)**: For managing background threads and writing more expressive code.
    *   **[MVVM Architecture](https://developer.android.com/topic/architecture#recommended-app-arch)**: A clear separation of concerns between the UI, business logic, and data layers using a Repository pattern.
    *   **[UI State Management](https://developer.android.com/topic/architecture/ui-layer/events#handle-viewmodel-events)**: Manages UI state for loading, loaded, and error conditions.

*   **Data & Networking**:
    *   **[Retrofit](https://square.github.io/retrofit/)**: A type-safe HTTP client for fetching data from the remote server.
    *   **[Room Database](https://developer.android.com/training/data-storage/room)**: Provides an abstraction layer over SQLite for robust offline data access.

*   **Dependency Injection & Build Tools**:
    *   **[Hilt](https://developer.android.com/training/dependency-injection/hilt-android)**: A dependency injection library that reduces the boilerplate of manual dependency injection.
    *   **[KSP (Kotlin Symbol Processing)](https://developer.android.com/build/migrate-to-ksp)**: An API for creating lightweight, high-performance compiler plugins in Kotlin.
    *   **[R8](https://developer.android.com/build/shrink-code)**: A code shrinker that reduces your app's size by removing unused code and resources.

*   **Custom Components**:
    *   **[PercentageWithAnimation](https://github.com/NicosNicolaou16/PercentagesWithAnimationCompose)**: A custom Compose component built by [@NicosNicolaou16](https://github.com/NicosNicolaou16) to animate and display Pokémon stats.

## 🏗️ Architecture

The project follows **Clean Architecture** principles combined with **MVVM (Model-View-ViewModel)** and **Unidirectional Data Flow (UDF)**. This ensures a clean separation of concerns, making the codebase scalable, maintainable, and testable.

### Project Structure

```
├── data/
│   ├── di/                 # Hilt Modules
│   ├── network/            # Retrofit DTOs and API Service
│   ├── room_database/      # Room Entities and DAOs
│   ├── repository_impl/    # Repository Implementations
│   └── mappers/            # Data transformation logic
├── domain/
│   └── repositories/       # Repository Interfaces
├── presentation/
│   ├── navigation/         # Navigation 3 setup and Navigator
│   ├── pokemon_list/       # List feature (Screen, ViewModel, State)
│   └── pokemon_details/    # Detail feature (Screen, ViewModel, State)
├── ui/
│   └── theme/              # Compose Theme (Color, Type, etc.)
└── utils/                  # Extension functions and generic classes
```


## 🔧 Versioning

*   **XR Compose version**: `1.0.0-alpha16`
*   **XR Runtime version**: `1.0.0-beta01`
*   **Material3 XR Compose version**: `1.0.0-alpha17`
*   **XR Extensions version**: `1.3.0`
*   **Target SDK**: `36`
*   **Minimum SDK**: `29`
*   **Kotlin Version**: `2.3.21`
*   **Gradle Version**: `9.2.1`

## 📚 References & Tutorials

*   [Develop UI with Jetpack Compose for XR](https://developer.android.com/develop/xr/jetpack-xr-sdk/develop-ui)
*   [Introducing the Android XR SDK Developer Preview](https://android-developers.googleblog.com/2024/12/introducing-android-xr-sdk-developer-preview.html)

## ⭐ Stargazers

If you enjoy this project, please give it a star!
Check out all the stargazers
here: [Stargazers on GitHub](https://github.com/NicosNicolaou16/Pokedex_Compose_XR/stargazers)

## 🙏 Support & Contributions

This project is actively maintained. Feedback, bug reports, and feature requests are welcome! Please feel free to **open an issue** or submit a **pull request**.