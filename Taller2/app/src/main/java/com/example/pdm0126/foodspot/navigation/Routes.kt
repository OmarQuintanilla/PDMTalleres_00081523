package com.example.pdm0126.foodspot.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object RestaurantListRoute : NavKey

@Serializable
data class RestaurantDetailRoute(val restaurantId: Int) : NavKey

@Serializable
data object SearchRoute : NavKey