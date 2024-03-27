package com.example.quotationapplication.model

data class Interest(
    val name: String,
    val baseModel: BaseModel
){
    val id: Int by baseModel::id
}
