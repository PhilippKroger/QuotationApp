package com.example.quotationapplication.model

import com.example.quotationapplication.model.Author
import com.example.quotationapplication.model.Category

data class Quote(
    val id: Int,
    val author: Author,
    val text: String,
    val likes: Int,
    val dislikes: Int,
    val categories: List<Category>
)