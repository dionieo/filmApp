package com.kopikode.movielist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movieTitle = intent.getStringExtra("title")
        val movieImage = intent.getIntExtra("image", 0)
        val movieDesc = intent.getStringExtra("desc")
        val movieAct = intent.getStringExtra("act")

        val ivPoster = findViewById<ImageView>(R.id.iv_detail_image)
        val tvTitle = findViewById<TextView>(R.id.tv_detail_title)
        val tvDesc = findViewById<TextView>(R.id.tv_detail_desc)
        val tvAct = findViewById<TextView>(R.id.tv_detail_act)

        ivPoster.setImageResource(movieImage)
        tvTitle.text = movieTitle
        tvDesc.text = movieDesc
        tvAct.text = movieAct
    }
}
