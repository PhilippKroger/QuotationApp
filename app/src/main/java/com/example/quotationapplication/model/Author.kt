package com.example.quotationapplication.model

data class Author(
    val name: String,
    val description: String,
    val photoUrl: String,
    val baseModel: BaseModel
){
    val id: Int by baseModel::id
}
