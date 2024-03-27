package com.example.quotationapplication.model

data class Author(
    val id: BaseModel,
    val name: String,
    val description: String,
    val photoUrl: String
)
