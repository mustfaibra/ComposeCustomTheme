package com.mustfaibra.customtheme.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class NewsTypography(
    val headline: TextStyle,
    val title: TextStyle,
    val subtitle: TextStyle,
    val body: TextStyle,
    val caption: TextStyle,
    val button: TextStyle,
)

// Our customized typography property that we will provide to the theme ^_^
val newsTypography = NewsTypography(
    headline = TextStyle(
        fontSize = 27.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Black,
    ),
    title = TextStyle(
        fontSize = 21.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
    subtitle = TextStyle(
        fontSize = 19.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    body = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),

)

val LocalNewsTypography = staticCompositionLocalOf { newsTypography }