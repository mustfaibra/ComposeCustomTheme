package com.mustfaibra.customtheme.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
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
    darkTheme: Boolean = isSystemInDarkTheme(),
    typography: NewsTypography = NewsTheme.typography,
    dimension: NewsDimension = NewsTheme.dimensions,
    shape: NewsShape = NewsTheme.shapes,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme
    val rememberedColors = remember { colors }

    MaterialTheme
    CompositionLocalProvider(
        LocalNewsColors provides rememberedColors,
        LocalNewsTypography provides typography,
        LocalNewsDimension provides dimension,
        LocalNewsShapes provides shape,
    ){
        content()
    }
}