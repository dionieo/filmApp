package com.kopikode.movielist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter constructor(
    private val getActivity: MainActivity,
    private val movieList : List<Movie>
) :

RecyclerView.Adapter<MovieAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context). inflate(R.layout.item_movie, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvTitle.text = movieList[position].title
        holder.tvImg.setImageResource(movieList[position].image)

        holder.cardView.setOnClickListener{
            Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_LONG).show()
        }
    }

    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvTitle : TextView = itemView.findViewById(R.id.tvTitle)
        val tvImg : ImageView = itemView.findViewById(R.id.movieImg)
        val cardView : CardView = itemView.findViewById(R.id.cardMovie)

    }

}


