package io.raconteur.presentation.composables

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// Simple placeholder domain model for screen rendering
data class Article(val id: String, val title: String)

sealed class NewsUiState {
    object Loading : NewsUiState()
    data class Success(val articles: List<Article>) : NewsUiState()
    data class Error(val message: String) : NewsUiState()
}

class NewsViewModel : ViewModel() {
    private val _uiState: MutableStateFlow<NewsUiState> = MutableStateFlow(NewsUiState.Loading)
    val uiState: StateFlow<NewsUiState> = _uiState

    init {
        onRefresh()
    }

    fun onRefresh() {
        viewModelScope.launch {
            // Simulate a data load
            try {
                _uiState.value = NewsUiState.Loading
                val items = listOf(
                    Article("1", "Breaking News"),
                    Article("2", "Tech Trends"),
                    Article("3", "Market Update")
                )
                _uiState.value = NewsUiState.Success(items)
            } catch (e: Exception) {
                _uiState.value = NewsUiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}
