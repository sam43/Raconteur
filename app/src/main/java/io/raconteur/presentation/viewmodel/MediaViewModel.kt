package io.raconteur.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// Simple placeholder domain model for screen rendering
data class Article(val id: String, val title: String)

sealed class UiState {
    object Loading : UiState()
    data class Success(val articles: List<Article>) : UiState()
    data class Error(val message: String) : UiState()
}

class NewsViewModel : ViewModel() {
    private val _uiState: MutableStateFlow<UiState> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState> = _uiState

    init {
        onRefresh()
    }

    fun onRefresh() {
        viewModelScope.launch {
            // Simulate a data load
            try {
                _uiState.value = UiState.Loading
                val items = listOf(
                    Article("1", "Breaking News"),
                    Article("2", "Tech Trends"),
                    Article("3", "Market Update")
                )
                _uiState.value = UiState.Success(items)
            } catch (e: Exception) {
                _uiState.value = UiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}
