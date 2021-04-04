package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val movieData: MovieData = MovieData(title = "From Russia with Love (1963)",
            rating = 4.0f,
            creators = "Terence Young",
            actors = "Sean Connery, Daniela Bianchi, Pedro Armendáriz ",
            genres = "Action, Adventure, Thriller",
            description = "James Bond 007 is on the search for a Russian decoding machine, known as Lektor. Bond needs to find this machine, before the evil S.P.E.C.T.R.E. organization discovers it. While being romantically linked with Russian girl, Tatiana Romanova, Bond sneaks his way around Istanbul, while each S.P.E.C.T.R.E. Agent tries to pick him off, including the over powering Donald Red Grant and ex K.G.B. Agent Rosa Klebb, who knows all of the tricks in the book, and even possesses an incredible poison tipped shoe."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.movieData = movieData

    }

    fun createToast(view: View) {
        Toast.makeText(applicationContext, "Classic Bond!",
                Toast.LENGTH_SHORT).show()
    }
}