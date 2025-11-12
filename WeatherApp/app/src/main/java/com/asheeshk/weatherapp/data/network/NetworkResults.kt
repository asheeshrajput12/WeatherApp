package com.asheeshk.weatherapp.data.network

sealed class NetworkResults {
    object Loading : NetworkResults()
    data class Success(val data: Any) : NetworkResults()
    data class Error(val message: String) : NetworkResults()
}