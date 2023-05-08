package com.mustfaibra.customtheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.mustfaibra.customtheme.components.NewsText
import com.mustfaibra.customtheme.data.Article
import com.mustfaibra.customtheme.ui.theme.NewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsTheme {
                NewsScreen(
                    articles = listOf(
                        Article(
                            headline = "Twitter, Again!",
                            title = "Twitter to remove inactive accounts",
                            body = "Social media platform Twitter Inc will remove accounts that have been inactive for several years, CEO Elon Musk said in a tweet on Monday."
                        ),
                        Article(
                            headline = "Cryptocurrency world, with BTC!",
                            title = "Binance lifts block on bitcoin withdrawals amid heavy volumes",
                            body = "Cryptocurrency exchange Binance halted bitcoin withdrawals for several hours on Monday, citing heavy volumes and a surge in processing fees, before clearing them at a higher cost."
                        ),
                        Article(
                            headline = "AI race, who will win?",
                            title = "Google plans to upgrade search with AI chat, video clips, Wall Street Journal reports",
                            body = "Google is planning to make its search engine more \"visual, snackable, personal, and human,\" with a focus on serving young people globally, the Wall Street Journal reported on Saturday, citing documents.\n" +
                                    "\n" +
                                    "The move comes as artificial intelligence (AI) applications such as ChatGPT are rapidly gaining in popularity, highlighting a technology that could upend the way businesses and society operate."
                        )
                    )
                )
            }
        }
    }
}

@Composable
fun NewsScreen(
    articles: List<Article>,
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(NewsTheme.colors.background)
            .padding(NewsTheme.dimensions.mediumPadding),
        verticalArrangement = Arrangement.spacedBy(NewsTheme.dimensions.smallPadding)
    ){
        item {
            NewsText(
                text = "Last Updates",
                style = NewsTheme.typography.headline,
            )
        }
        items(articles){article->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                NewsText(text = article.headline, style = NewsTheme.typography.headline)
                NewsText(text = article.title, style = NewsTheme.typography.title)
                NewsText(
                    text = article.body,
                    style = NewsTheme.typography.body,
                    textAlign = TextAlign.Justify,
                )
                Spacer(modifier = Modifier.height(NewsTheme.dimensions.smallPadding))
                Row(
                    horizontalArrangement = Arrangement
                        .spacedBy(NewsTheme.dimensions.largePadding),
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.ic_comment),
                        contentDescription = "comment",
                        tint = NewsTheme.colors.primary,
                        modifier = Modifier
                            .clip(CircleShape)
                            .clickable {  }
                            .padding(NewsTheme.dimensions.smallPadding)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = "share",
                        tint = NewsTheme.colors.primary,
                        modifier = Modifier
                            .clip(CircleShape)
                            .clickable {  }
                            .padding(NewsTheme.dimensions.smallPadding)
                    )
                }
            }
        }
    }
}