package com.example.quotationapplication.model

import com.example.quotationapplication.model.Interest
import com.example.quotationapplication.model.Role

data class User(
    val id: BaseModel,
    val email: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val interests: List<Interest>,
    val role: Role
)
