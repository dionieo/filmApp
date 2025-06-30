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
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,3)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieAdapter
        prepareMoviesListData()
    }

    private fun prepareMoviesListData() {
        var movie = Movie("Ant Man", R.drawable.antman, "Ini adalah film tentang manusia menjadi semut", "Paul Rudd, Evangeline Lilly")
        movieList.add(movie)

        movie = Movie("Avenger", R.drawable.avenger, "Ini adalah film tentang superhero yang bersatu untuk melawan kejahatan", "Robert Downey Jr., Chris Evans")
        movieList.add(movie)

        movie = Movie("Aqua Man", R.drawable.aquaman, "Ini adalah film tentang manusia yang memiliki kekuatan untuk berkomunikasi dengan makhluk laut", "Jason Momoa, Amber Heard")
        movieList.add(movie)

        movie = Movie("Captain America", R.drawable.captain, "Ini adalah film tentang seorang prajurit super yang berjuang untuk keadilan", "Chris Evans, Hayley Atwell")
        movieList.add(movie)

        movie = Movie("Thor", R.drawable.thor, "Ini adalah film tentang dewa petir yang turun ke bumi untuk melindungi umat manusia", "Chris Hemsworth, Tom Hiddleston")
        movieList.add(movie)

        movie = Movie("Spiderman", R.drawable.spiderman, "Ini adalah film tentang seorang remaja yang mendapatkan kekuatan laba-laba dan menjadi pahlawan super", "Tom Holland, Zendaya")
        movieList.add(movie)

        movie = Movie("Eternal", R.drawable.eternal, "Ini adalah film tentang sekelompok makhluk abadi yang telah hidup di bumi selama ribuan tahun dan harus melindungi umat manusia dari ancaman", "Gemma Chan, Richard Madden")
        movieList.add(movie)

        movie = Movie("Doctor Strange", R.drawable.eternal, "Ini adalah film tentang seorang dokter bedah yang menjadi penyihir untuk melindungi dunia dari ancaman sihir jahat", "Benedict Cumberbatch, Tilda Swinton")
        movieList.add(movie)

        movie = Movie("Black Panther", R.drawable.eternal, "Ini adalah film tentang seorang raja Afrika yang memiliki kekuatan super dan harus melindungi kerajaannya dari ancaman", "Chadwick Boseman, Lupita Nyong'o")
        movieList.add(movie)

        movie = Movie("Guardians of the Galaxy", R.drawable.eternal, "Ini adalah film tentang sekelompok penjahat yang bersatu untuk melindungi galaksi dari ancaman", "Chris Pratt, Zoe Saldana")
        movieList.add(movie)

        movie = Movie("Black Widow", R.drawable.eternal, "Ini adalah film tentang seorang mantan mata-mata yang harus menghadapi masa lalunya dan melindungi dunia dari ancaman", "Scarlett Johansson, Florence Pugh")
        movieList.add(movie)

        movie = Movie("Shang-Chi", R.drawable.eternal, "Ini adalah film tentang seorang ahli bela diri yang harus menghadapi ayahnya yang jahat dan melindungi dunia dari ancaman", "Simu Liu, Awkwafina")
        movieList.add(movie)
        
        movieAdapter!!.notifyDataSetChanged()
    }
}