package com.mustfaibra.customtheme.ui.theme

import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

object NewsTheme {
    val typography: NewsTypography
        @ReadOnlyComposable
        @Composable
        get() = LocalNewsTypography.current
    val colors: NewsColors
        @ReadOnlyComposable
        @Composable
        get() = LocalNewsColors.current
    val dimensions: NewsDimension
        @ReadOnlyComposable
        @Composable
        get() = LocalNewsDimension.current
    val shapes: NewsShape
        @ReadOnlyComposable
        @Composable
        get() = LocalNewsShapes.current
}

@Composable
fun NewsTheme(
    themeMode: ThemeMode = ThemeMode.Light,
    typography: NewsTypography = NewsTheme.typography,
    dimension: NewsDimension = NewsTheme.dimensions,
    shape: NewsShape = NewsTheme.shapes,
    content: @Composable () -> Unit
) {
    Log.d("NewsTheme -> ", "Theme mode changed to $themeMode")
    val colors = when (themeMode) {
        ThemeMode.Dark -> DarkColorScheme
        ThemeMode.Light -> LightColorScheme
        ThemeMode.Space -> SpaceColorScheme
    }
    LaunchedEffect(key1 = colors){
        Log.d("NewsTheme -> ", "Colors changed")
    }
    CompositionLocalProvider(
        LocalNewsColors provides colors,
        LocalNewsTypography provides typography,
        LocalNewsDimension provides dimension,
        LocalNewsShapes provides shape,
    ){
        content()
    }
}