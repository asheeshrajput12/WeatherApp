package com.asheeshk.weatherapp.ui.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object SearchScreen : Screen("search_screen")
    object ForecastScreen : Screen("forecast_screen")
}