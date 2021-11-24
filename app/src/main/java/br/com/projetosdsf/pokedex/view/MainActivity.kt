package br.com.projetosdsf.pokedex.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Chronometer
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.projetosdsf.pokedex.R
import br.com.projetosdsf.pokedex.api.PokemonRepo
import br.com.projetosdsf.pokedex.api.model.PokemonResult
import br.com.projetosdsf.pokedex.domain.Pokemon
import br.com.projetosdsf.pokedex.domain.PokemonType
import br.com.projetosdsf.pokedex.viewmodel.PokemonViewModel
import br.com.projetosdsf.pokedex.viewmodel.PokemonViewModelFactory

class MainActivity : AppCompatActivity() {
    private val recyclerView by lazy{
        findViewById<RecyclerView>(R.id.rvPokemons)
    }
    private val viewModel by lazy {
        ViewModelProvider(this, PokemonViewModelFactory())
            .get(PokemonViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.pokemons.observe(this, Observer {
            loadRecyclerView(it)
        })
    }

    private fun loadRecyclerView(pokemons: List<Pokemon?>) {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}