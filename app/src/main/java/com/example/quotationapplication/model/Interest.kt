package com.example.quotationapplication.model

data class Interest(
    val baseModel: BaseModel,
    val name: String,
){
    val id: Int by baseModel::id
}
