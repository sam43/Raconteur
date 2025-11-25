package io.raconteur.presentation.composables

import androidx.lifecycle.ViewModel

sealed class NewsUiState {
    object Loading : NewsUiState()
    data class Success(val articles: List<Article>) : NewsUiState()
}
class NewsViewModel : ViewModel() {
    val uiState: StateFlow<NewsUiState> = MutableStateFlow(NewsUiState.Loading)
}
