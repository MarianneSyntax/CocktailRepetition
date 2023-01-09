package com.example.cocktailrepetition.data.remote

import com.example.cocktailrepetition.data.models.Cocktail
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


const val BASE_URL = "https://www.thecocktaildb.com/api/json/v1/"


private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface CocktailApiService {

    @GET("search.php?s=margarita")
    suspend fun getMargaritaList(): List<Cocktail>
}

object CocktailApi {
    val retrofitService: CocktailApiService by lazy { retrofit.create(CocktailApiService::class.java) }
}