package com.asheeshk.weatherapp.ui.navigation

sealed class Screens(val route:String) {

    object HomeScreen:Screens("home")

}