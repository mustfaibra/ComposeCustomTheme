package com.mustfaibra.customtheme.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.mustfaibra.customtheme.ui.theme.NewsTheme

@Composable
fun NewsButton(
    modifier: Modifier = Modifier,
    backgroundColor: Color = NewsTheme.colors.primary,
    contentColor: Color = contentColorFor(backgroundColor = backgroundColor),
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = NewsTheme.shapes.buttonShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor,
        ),
        content = content,
    )
}

@Composable
fun NewsText(
    modifier: Modifier = Modifier,
    style: TextStyle = NewsTheme.typography.title,
    textColor: Color = NewsTheme.colors.onBackground,
    textAlign: TextAlign = TextAlign.Start,
    text: String,
) {
    Text(
        modifier = modifier,
        text = text,
        style = style,
        textAlign = textAlign,
        color = textColor,
    )
}