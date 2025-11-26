package io.raconteur.presentation.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ArticleCard(article: Article) {
    Text(article.title)
}