package com.example.cocktailrepetition.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.cocktailrepetition.databinding.FragmentHomeBinding
import com.example.cocktailrepetition.ui.CocktailAdapter
import com.example.cocktailrepetition.ui.CocktailViewModel

class HomeFragment : Fragment() {


    private val viewModel: CocktailViewModel by viewModels()

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // instanz vom adapter anlegen
        val cocktailAdapter = CocktailAdapter()
        // recycler also aus dem layout holen
        val cocktailRecycler = binding.cocktailRecycler
        // dem recycler den adapter zuweisen, damit er weiss, was er darstellen soll
        cocktailRecycler.adapter = cocktailAdapter

        viewModel.getCocktails()
        viewModel.cocktails.observe(viewLifecycleOwner) {
            cocktailAdapter.submitList(it)
        }
    }

}