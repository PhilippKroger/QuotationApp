package com.example.quotationapplication.model


data class Quote(
    val id: Int,
    val author: Author,
    val text: String,
    val likes: Int,
    val dislikes: Int,
    val categories: List<Category>
)