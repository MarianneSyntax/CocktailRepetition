package com.example.cocktailrepetition.data.models

import androidx.room.PrimaryKey
import com.squareup.moshi.Json

//todo: data class, die die antwort des api calls auffängt

data class Cocktail(

    @Json(name = "strDrink")
    val cocktailName: String,

    @Json(name = "strDrinkThumb")
    val cocktailImage: String

)