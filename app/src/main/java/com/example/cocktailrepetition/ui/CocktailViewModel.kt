package com.example.cocktailrepetition.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cocktailrepetition.data.Repository
import kotlinx.coroutines.launch

open class CocktailViewModel: ViewModel() {

    private val repository = Repository()

    //todo: livedata, die cocktails enthält


    //todo: suspend function, die cocktails aus dem repository holt und in die livedata schreibt
    fun getCocktails() {

    }


}