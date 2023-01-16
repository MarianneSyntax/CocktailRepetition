package com.example.cocktailrepetition.data

import com.example.cocktailrepetition.data.models.Cocktail
import com.example.cocktailrepetition.data.remote.CocktailApi


class Repository() {

    //suspend function, die die cocktails aus dem api call holt

    suspend fun getCocktails() : List<Cocktail>{
        // CocktailList -> List<Cocktails> in ner Variable namens drinks
        val result = CocktailApi.retrofitService.getMargaritaList().drinks
        return result
    }


}