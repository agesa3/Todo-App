package com.agesadev.todoapp.util

sealed class UiEvent {
    object PopBackStack : UiEvent()
    data class Navigate(val router: String) : UiEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null
    ) : UiEvent()

}