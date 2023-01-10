package com.example.cocktailrepetition.data

import com.example.cocktailrepetition.data.models.Cocktail
import com.example.cocktailrepetition.data.remote.CocktailApi

class Repository() {

    suspend fun getCocktails(): List<Cocktail> {
        return CocktailApi.retrofitService.getMargaritaList().drinks
    }
}