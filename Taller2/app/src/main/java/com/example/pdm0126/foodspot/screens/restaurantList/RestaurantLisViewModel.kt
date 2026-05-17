package com.example.pdm0126.foodspot.screens.restaurantList

import kotlin.collections.mutableListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pdm0126.foodspot.data.repositories.FoodApiRepository
import com.example.pdm0126.foodspot.data.repositories.FoodRepository
import com.example.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class RestaurantListUiState(
    val groupedRestaurants: Map<String, List<Restaurant>> = emptyMap(),
val isLoading: Boolean = false,
val error: String? = null
)

class RestaurantListViewModel : ViewModel() {

    private val repository: FoodRepository = FoodApiRepository()

    private val _uiState = MutableStateFlow(RestaurantListUiState())
    val uiState: StateFlow<RestaurantListUiState> = _uiState.asStateFlow()

    init {
        loadRestaurants()
    }

    fun loadRestaurants() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            try {
                val restaurants = repository.getRestaurants()
                _uiState.value = _uiState.value.copy(
                    groupedRestaurants = groupByCategory(restaurants),
                    isLoading = false
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = "Error al cargar los restaurantes"
                )
            }
        }
    }

    private fun groupByCategory(restaurants: List<Restaurant>): Map<String, List<Restaurant>> {
        val map = mutableMapOf<String, MutableList<Restaurant>>()
        restaurants.forEach { restaurant ->
            restaurant.categories.forEach { category ->
                map.getOrPut(category) { mutableListOf() }.add(restaurant)
            }
        }
        return map
    }
}