package com.example.htttp_and_todolist.viewmodel

data class Todo(
    val userId: Int,
    val id: Int,
    val title: String,
    val completed: Boolean
)