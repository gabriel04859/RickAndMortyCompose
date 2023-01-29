package com.grfsa.rickandmortycompose.feature_home.data.utils

sealed class RequestState<out R> {
    data class Success<out T>(val data: T?): RequestState<T>()
    data class Failure(val error: Exception?): RequestState<Nothing>()
}