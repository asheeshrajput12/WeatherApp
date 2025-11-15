package com.asheeshk.weatherapp.data.networks


sealed class NetworkResults<out T> {
    data class Success<out T>(val data: T) : NetworkResults<T>()
    data class Error(val message: String) : NetworkResults<Nothing>()
    object Loading : NetworkResults<Nothing>()
}