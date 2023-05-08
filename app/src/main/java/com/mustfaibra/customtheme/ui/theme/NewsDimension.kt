package com.mustfaibra.customtheme.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class NewsDimension(
    val smallPadding: Dp = 8.dp,
    val mediumPadding: Dp = smallPadding.times(2),
    val largePadding: Dp = smallPadding.times(3),
    val smallIcon: Dp = 24.dp,
    val mediumIcon: Dp = 36.dp,
    val largeIcon: Dp = 48.dp,
)

val LocalNewsDimension = staticCompositionLocalOf { NewsDimension() }