package com.example.cocktailrepetition.data.remote

import com.example.cocktailrepetition.data.models.CocktailList
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.DELETE
import retrofit2.http.GET


//base url

const val BASE_URL = "www.thecocktaildb.com/api/json/v1/1/"

//moshi converter factory

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

//retrofit builder

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

//interface mit get function

interface CocktailApiService{

    @GET("search.php?s=margarita")
    suspend fun getMargaritaList() : CocktailList

}


//object, das interface implementiert

object CocktailApi {
    val retrofitService: CocktailApiService by lazy {
        retrofit.create(CocktailApiService::class.java)
    }
}

