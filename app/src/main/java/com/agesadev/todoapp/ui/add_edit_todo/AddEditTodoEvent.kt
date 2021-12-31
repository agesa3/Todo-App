package com.agesadev.todoapp.ui.add_edit_todo

sealed class AddEditTodoEvent {
    data class OnTitleChanged(val title: String) : AddEditTodoEvent()
    data class OnDescriptionChanged(val description: String) : AddEditTodoEvent()
    object OnSaveTodoClick : AddEditTodoEvent()

}
