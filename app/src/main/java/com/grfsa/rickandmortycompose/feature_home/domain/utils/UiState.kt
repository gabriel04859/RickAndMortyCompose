package com.grfsa.rickandmortycompose.feature_home.domain.utils

sealed class UiState<out R> {
    object Loading: UiState<Nothing>()
    object InitialState: UiState<Nothing>()
    data class Success<out T>(val data: T?): UiState<T>()
    data class Failure(val error: Throwable?): UiState<Nothing>()
}