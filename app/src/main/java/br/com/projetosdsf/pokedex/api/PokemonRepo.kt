package br.com.projetosdsf.pokedex.api

import android.util.Log
import br.com.projetosdsf.pokedex.api.model.PokemonApiResult
import br.com.projetosdsf.pokedex.api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRepo {
    private val service: PokemonService

    init{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(PokemonService::class.java)
    }

    fun listPokemons(number: Int = 151): PokemonsApiResult? {
        val call = service.listPokemons(number)

        return call.execute().body()
    }

    fun getPokemon(number: Int): PokemonApiResult? {
        val call = service.getPokemon(number)

        return call.execute().body()
    }
}