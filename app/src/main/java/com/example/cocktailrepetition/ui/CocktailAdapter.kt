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


    private var dataset = listOf<Cocktail>()

    inner class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(
        view){
        val cocktailName = view.findViewById<TextView>(R.id.cocktail_name)
        val cocktailImage = view.findViewById<ImageView>(R.id.cocktail_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // layout aufpumpen, ItemViewHolder der aufgepumptes Layout festhält zurückgeben
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.cocktail_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // dem item inhalt zuweisen
        val cocktailItem = dataset[position]
        //name und bild des cocktails in die views schreiben
        //name:
        holder.cocktailName.text = cocktailItem.cocktailName
        // coil hilft, bilder aus dem internet easy reinzuladen
        holder.cocktailImage.load(cocktailItem.cocktailImage)
    }

    override fun getItemCount(): Int {
       return dataset.size
    }

    //submitList, die die liste von cocktails bekommt und die liste im adapter aktualisiert
    fun submitList(list: List<Cocktail>) {
        dataset = list
        notifyDataSetChanged()
    }


}