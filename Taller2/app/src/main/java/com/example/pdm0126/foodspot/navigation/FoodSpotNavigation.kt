package com.example.pdm0126.foodspot.navigation


import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.pdm0126.foodspot.screens.resturantDetails.RestaurantDetailScreen
import com.example.pdm0126.foodspot.screens.restaurantList.RestaurantListScreen
import com.example.pdm0126.foodspot.screens.restaurantList.RestaurantListViewModel
import com.example.pdm0126.foodspot.screens.resturantDetails.RestaurantDetailViewModel
import com.example.pdm0126.foodspot.screens.search.SearchScreen
import com.example.pdm0126.foodspot.screens.search.SearchViewModel
@Composable
fun FoodSpotNavigation() {
    val backStack = rememberNavBackStack(RestaurantListRoute)

    val restaurantListViewModel = remember { RestaurantListViewModel() }
    val searchViewModel = remember { SearchViewModel() }

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<RestaurantListRoute> {
                RestaurantListScreen(
                    viewModel = restaurantListViewModel,
                    onRestaurantClick = { id ->
                        backStack.add(RestaurantDetailRoute(restaurantId = id))
                    },
                    onSearchClick = {
                        backStack.add(SearchRoute)
                    }
                )
            }

            entry<RestaurantDetailRoute> { key ->
                val detailViewModel = RestaurantDetailViewModel(restaurantId = key.restaurantId)
                RestaurantDetailScreen(
                    viewModel = detailViewModel,
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            entry<SearchRoute> {
                SearchScreen(
                    viewModel = searchViewModel,
                    onBack = { backStack.removeLastOrNull() },
                    onRestaurantClick = { id ->
                        backStack.add(RestaurantDetailRoute(restaurantId = id))
                    }
                )
            }
        }
    )
}