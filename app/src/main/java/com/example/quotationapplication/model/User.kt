package com.example.quotationapplication.model

data class User(
    val id: Int,
    val email: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val interests: List<Interest>,
    val role: Role
)
