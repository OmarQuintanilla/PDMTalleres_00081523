package com.example.pdm0126.foodspot.navigation


import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.pdm0126.foodspot.screens.resturantDetails.RestaurantDetailScreen
import com.example.pdm0126.foodspot.screens.restaurantList.RestaurantListScreen
import com.example.pdm0126.foodspot.screens.restaurantList.RestaurantListViewModel
import com.example.pdm0126.foodspot.screens.search.SearchScreen

@Composable
fun FoodSpotNavigation() {
    val backStack = rememberNavBackStack(RestaurantListRoute)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<RestaurantListRoute> {
                val viewModel = RestaurantListViewModel()
                RestaurantListScreen(
                    viewModel = viewModel,
                    onRestaurantClick = { id ->
                        backStack.add(RestaurantDetailRoute(restaurantId = id))
                    },
                    onSearchClick = {
                        backStack.add(SearchRoute)
                    }
                )
            }

            entry<RestaurantDetailRoute> { key ->
                RestaurantDetailScreen(
                    restaurantId = key.restaurantId,
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            entry<SearchRoute> {
                SearchScreen(
                    onBack = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}