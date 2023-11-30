package com.kopikode.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var movieAdapter : MovieAdapter? = null
    private var movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieList = ArrayList()

        recyclerView = findViewById<View>(R.id.rv_movielist) as RecyclerView
        movieAdapter = MovieAdapter(this@MainActivity, movieList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieAdapter

        prepareMoviesListData()

    }

    private fun prepareMoviesListData() {
        var movie = Movie("Ant Man", R.drawable.antman)
        movieList.add(movie)

        movie = Movie("Avenger", R.drawable.avenger)
        movieList.add(movie)

        movie = Movie("Aqua Man", R.drawable.aquaman)
        movieList.add(movie)

        movie = Movie("Captain America", R.drawable.captain)
        movieList.add(movie)

        movie = Movie("Thor", R.drawable.thor)
        movieList.add(movie)

        movie = Movie("Spiderman", R.drawable.spiderman)
        movieList.add(movie)

        movie = Movie("Eternal", R.drawable.eternal)
        movieList.add(movie)
        
        movieAdapter!!.notifyDataSetChanged()
    }
}