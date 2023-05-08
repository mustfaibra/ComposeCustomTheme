package com.mustfaibra.customtheme.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape

@Immutable
data class NewsShape(
    val buttonShape: Shape = RoundedCornerShape(percent = 25),
    val surfaceShape: Shape = RoundedCornerShape(percent = 20),
)

val LocalNewsShapes = staticCompositionLocalOf { NewsShape() }
