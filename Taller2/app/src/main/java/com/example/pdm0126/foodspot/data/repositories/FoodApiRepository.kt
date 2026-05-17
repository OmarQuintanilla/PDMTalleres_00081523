package com.example.pdm0126.foodspot.data.repositories

import com.example.pdm0126.foodspot.data.dummy.dummyRestaurants
import com.example.pdm0126.foodspot.model.Dish
import com.example.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.delay

class FoodApiRepository : FoodRepository {
    override suspend fun getRestaurants(): List<Restaurant> {
        delay(2000)
        return dummyRestaurants
    }

    override suspend fun getRestaurantById(id: Int): Restaurant? {
        delay(800)
        return dummyRestaurants.find { it.id == id }
    }

    override suspend fun searchDishes(query: String): List<Dish> {
        delay(1000)
        if (query.isBlank()) return emptyList()

        val lowerQuery = query.lowercase()
        val allDishes = dummyRestaurants.flatMap { it.menu }

        return allDishes.filter { dish ->
            dish.name.lowercase().contains(lowerQuery) ||
                    dish.description.lowercase().contains(lowerQuery)
        }
    }

    override suspend fun searchRestaurants(query: String): List<Restaurant> {
        delay(500)
        if (query.isBlank()) return emptyList()

        val lowerQuery = query.lowercase()
        return dummyRestaurants.filter { restaurant ->
            restaurant.name.lowercase().contains(lowerQuery) ||
                    restaurant.description.lowercase().contains(lowerQuery) ||
                    restaurant.menu.any { dish -> dish.name.lowercase().contains(lowerQuery) ||
                            dish.description.lowercase().contains(lowerQuery)}
        }
    }
}