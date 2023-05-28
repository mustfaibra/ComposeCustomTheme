# Jetpack Compose Custom Theme
A simple use case for implementing a full customized theme on Android with Jetpack Compose instead of using the traditional MaterialTheme that follow Google Design Material.

This repository demonstrates how to configure and use custome themes in Jetpack Compose, the modern toolkit for building native Android UI. By following the examples in this repository, you'll learn how to create custom themes, switch between light and dark themes, and apply the theme that you customized to your composable functions.

## Repository Scope

The repository covers the following theme configuration topics in Jetpack Compose:

* **Creating a custom theme** : Learn how to create a full customized theme with your own color palette properties, typography, shapes, and the most important the dimensions which the default MaterialTheme **DOESN'T** contains at all.

* **Support for light and dark themes** : Discover how to create your own implementation of theme modes and also switching between them based on the user's system preferences or by providing an in-app toggle.

* **Applying themes to composables** : Understand how to apply your custom theme to composable functions and ensure a consistent look and feel throughout your app. **PLEASE NOTE** that you should build your own basic composables like texts and buttons and checkbox by wrapping the default composables inside your composables because the default one uses the MaterialTheme internally by default and your theme will not be fully applied unfortunatelly.

## Usage

The repository contains a sample Android app with examples for each of the features mentioned above. Explore the code to see how the different theme configurations are implemented and applied.
To run the sample app, open the project in Android Studio, and click the "Run" button. The app will be installed on your connected device or emulator, and you can interact with the various theme configuration examples.


## License

This project is licensed under the MIT License, so feel free to do what you want with it and enjoy.
