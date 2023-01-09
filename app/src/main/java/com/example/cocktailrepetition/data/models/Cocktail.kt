package com.example.cocktailrepetition.data.models

import androidx.room.PrimaryKey
import com.squareup.moshi.Json

data class Cocktail(
    @PrimaryKey
    @Json(name = "idDrink")
    val cocktailId: Long,

    @Json(name = "strDrink")
    val cocktailName: String,

    @Json(name = "strDrinkThumb")
    val cocktailImage: String
)