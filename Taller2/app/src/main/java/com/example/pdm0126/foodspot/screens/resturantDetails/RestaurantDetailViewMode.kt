package com.example.pdm0126.foodspot.screens.resturantDetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pdm0126.foodspot.data.repositories.FoodApiRepository
import com.example.pdm0126.foodspot.data.repositories.FoodRepository
import com.example.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class RestaurantDetailUiState(
    val restaurant: Restaurant? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

class RestaurantDetailViewModel(private val restaurantId: Int) : ViewModel() {

    private val repository: FoodRepository = FoodApiRepository()

    private val _uiState = MutableStateFlow(RestaurantDetailUiState())
    val uiState: StateFlow<RestaurantDetailUiState> = _uiState.asStateFlow()

    init {
        loadRestaurant()
    }

    private fun loadRestaurant() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            try {
                val restaurant = repository.getRestaurantById(restaurantId)
                if (restaurant != null) {
                    _uiState.value = _uiState.value.copy(
                        restaurant = restaurant,
                        isLoading = false
                    )
                } else {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = "Restaurante no encontrado"
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = "Error al cargar el restaurante"
                )
            }
        }
    }
}