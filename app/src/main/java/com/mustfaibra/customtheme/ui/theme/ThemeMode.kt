package com.mustfaibra.customtheme.ui.theme

sealed class ThemeMode(val title: String) {
    object Light: ThemeMode(title = "Light")
    object Dark: ThemeMode(title = "Dark")
    object Space: ThemeMode(title = "Space")
}
