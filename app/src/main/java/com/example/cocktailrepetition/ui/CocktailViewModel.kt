package com.example.cocktailrepetition.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cocktailrepetition.data.Repository
import com.example.cocktailrepetition.data.models.Cocktail
import kotlinx.coroutines.launch

open class CocktailViewModel: ViewModel() {

    private val repository = Repository()

    // livedata, die cocktails enthält
    private val _cocktails = MutableLiveData<List<Cocktail>>()
    public val cocktails: LiveData<List<Cocktail>>
        get() = _cocktails


    //suspend function, die cocktails aus dem repository holt und in die livedata schreibt
    fun getCocktails() {
        viewModelScope.launch {
            _cocktails.value = repository.getCocktails()
        }
    }


}