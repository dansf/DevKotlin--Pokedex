package br.com.projetosdsf.pokedex.api.model

import br.com.projetosdsf.pokedex.domain.PokemonType

data class PokemonsApiResult (
        val results: List<PokemonResult>,
        val count: Int,
        val previous: String?,
        val next: String?
)

data class PokemonResult(
        val name: String,
        val url: String
)

data class PokemonApiResult (
    val id: Int,
    val name: String,
    val types: List<PokemonTypeSlot>
    )

data class PokemonTypeSlot(
    val slot: Int,
    val type: PokemonType
)