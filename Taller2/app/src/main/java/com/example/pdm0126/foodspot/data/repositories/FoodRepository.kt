package com.example.pdm0126.foodspot.data.repositories

import com.example.pdm0126.foodspot.model.Dish
import com.example.pdm0126.foodspot.model.Restaurant

interface FoodRepository {
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun getRestaurantById(id: Int): Restaurant?
    suspend fun searchDishes(query: String): List<Dish>
}