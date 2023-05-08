package com.mustfaibra.customtheme.data

import java.util.Date

data class Article(
    val headline: String,
    val title: String,
    val body: String,
    val writtenAt: String = Date().toString(),
)
