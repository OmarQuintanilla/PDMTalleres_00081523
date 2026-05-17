package com.example.pdm0126.foodspot.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pdm0126.foodspot.data.repositories.FoodApiRepository
import com.example.pdm0126.foodspot.data.repositories.FoodRepository
import com.example.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class SearchUiState(
    val query: String = "",
    val results: List<Restaurant> = emptyList(),
    val hasSearched: Boolean = false,
    val isLoading: Boolean = false
)

class SearchViewModel : ViewModel() {

    private val repository: FoodRepository = FoodApiRepository()

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState.asStateFlow()

    fun onQueryChange(query: String) {
        _uiState.value = _uiState.value.copy(query = query)

        if (query.isBlank()) {
            _uiState.value = _uiState.value.copy(results = emptyList(), hasSearched = false, isLoading = false)
            return
        }

        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, hasSearched = true)
            val results = repository.searchRestaurants(query)
            _uiState.value = _uiState.value.copy(results = results, isLoading = false)
        }
    }
}