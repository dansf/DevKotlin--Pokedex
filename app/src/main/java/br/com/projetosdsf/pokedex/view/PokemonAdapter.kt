package br.com.projetosdsf.pokedex.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.projetosdsf.pokedex.R
import br.com.projetosdsf.pokedex.domain.Pokemon
import com.bumptech.glide.Glide
import java.util.*

// RecyclerView é o ViewGroup que contém as visualizações correspondentes aos seus dados.
/*
 * ViewGroup é um tipo especial de visualização que é estendido de View como sua classe base.
 * ViewGroup é a classe base dos layouts, como o nome indica, o modo de exibição é singular e
 * o grupo de modos de exibição é o ViewGroup.
 */
class PokemonAdapter(
    val items : List<Pokemon?>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item,
            parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(item: Pokemon?) = with(itemView){
            val ivPokemon = findViewById<ImageView>(R.id.ivPokemon)
            val tvNumber = findViewById<TextView>(R.id.tvNumber)
            val tvName = findViewById<TextView>(R.id.tvName)
            val tvType1 = findViewById<TextView>(R.id.tvType1)
            val tvType2 = findViewById<TextView>(R.id.tvType2)

            item?.let{
                Glide.with(itemView.context).load(it.imagemUrl).into(ivPokemon)

                tvNumber.text = "Nº ${item.formattedNumber}"
                tvName.text = item.formattedName
                tvType1.text = item.types[0].name.replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(
                        Locale.getDefault()
                    ) else it.toString()
                }

                if(item.types.size > 1){
                    tvType2.visibility = View.VISIBLE
                    tvType2.text = item.types[1].name.replaceFirstChar {
                        if (it.isLowerCase()) it.titlecase(
                            Locale.getDefault()
                        ) else it.toString()
                    }
                }
                else{
                    tvType2.visibility = View.GONE
                }
            }
        }
    }
}