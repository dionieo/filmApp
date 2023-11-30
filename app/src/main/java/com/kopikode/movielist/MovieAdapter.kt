package com.kopikode.movielist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent



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
        holder.cardView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("title", movieList[position].title)
            intent.putExtra("image", movieList[position].image)
            intent.putExtra("desc", movieList[position].desc)
            intent.putExtra("act", movieList[position].act)
            context.startActivity(intent)
        }

    }

    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvTitle : TextView = itemView.findViewById(R.id.tvTitle)
        val tvImg : ImageView = itemView.findViewById(R.id.movieImg)
        val cardView : CardView = itemView.findViewById(R.id.cardMovie)

    }

}


