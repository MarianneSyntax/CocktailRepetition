package com.example.cocktailrepetition.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.cocktailrepetition.R
import com.example.cocktailrepetition.data.models.Cocktail

class CocktailAdapter(): RecyclerView.Adapter<CocktailAdapter.ItemViewHolder>() {

    //TODO: dataset

    inner class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(
        view){
        //TODO
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //TODO
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //todo: dem item inhalt zuweisen
        //TODO: set name and picture, need Cocktail data class for that

    }

    override fun getItemCount(): Int {
       //TODO
    }

    fun submitList(list: List<Cocktail>) {
        //Todo
    }


}