package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val movieData: MovieData = MovieData(title = "Scarface",
            rating = 4.5f,
            creators = "Brian De Palma",
            actors = "Al Pacino, Michelle Pfeiffer, Steven Bauer",
            genres = "Crime, Drama",
            description = "In 1980, Cuban refugee and ex-convict Tony Montana arrives in Miami, Florida, as part of the Mariel boatlift, where he is sent to a refugee camp with friends Manny Ray, Angel, and Chi Chi.\n" +
                    "        \nThe four are released and given green cards in exchange for murdering a former Cuban general at the request of Miami drug lord Frank Lopez. They become dishwashers at an eatery, but a dissatisfied Tony proclaims that he is meant for bigger things.\n" +
                    "        \nFrank\'s right-hand man, Omar, sends the four to purchase cocaine from Colombian dealers, but the deal goes badly. Angel is dismembered with a chainsaw, while Manny and Chi Chi rescue Tony and kill the Colombians. Suspecting that Omar set them up, Tony and Manny insist on personally delivering the recovered drugs and money to Frank. During their meeting, Tony is attracted to Frank\'s trophy wife, Elvira. Frank hires Tony and Manny. Tony reunites with his mother and younger sister Gina, of whom he is overprotective. Disgusted by his life of crime, his mother throws him out. Manny is attracted to Gina, but Tony tells him to stay away from her.\n" +
                    "        \nFrank sends Tony and Omar to Cochabamba, Bolivia to meet with cocaine kingpin Alejandro Sosa. Tony negotiates a deal without Frank\'s approval, angering Omar. Sosa claims that Omar is a police informant and that Frank has poor judgement; Tony witnesses a beaten Omar hanged from a helicopter. Tony vouches for Frank\'s organization, and Sosa, taking a liking to Tony, agrees to the deal, but not before warning Tony never to betray him.\n" +
                    "        \nBack in Miami, Frank is infuriated by Omar\'s demise and the unauthorized deal struck by Tony, while Tony starts his own independent cocaine operation. At a nightclub, Bernstein, a corrupt police detective on Frank\'s payroll, attempts to extort money from Tony in return for police protection. Tony spots Gina fraternizing with a man and beats them both when he sees him grope her. Hitmen then attempt to assassinate Tony, who escapes but is wounded. He confronts Frank and Bernstein, certain that they orchestrated the attack; Frank confesses his involvement at gunpoint and begs for his life, but he and Bernstein are killed by Manny and Tony, respectively. Tony marries Elvira and becomes the distributor of Sosa\'s product, using his profits to build a multi-million-dollar business empire and construct a vast, heavily guarded estate.\n" +
                    "        \nIn 1983, a sting operation by federal agents results in Tony being charged with tax evasion and money laundering, with an inevitable prison sentence. Sosa offers to use his government connections to keep Tony out of prison, but only if Tony assassinates an activist intending to expose Sosa\'s drug operations. During a public dinner, Tony accuses Manny of causing his arrest and Elvira of being an infertile junkie, causing Elvira to leave him.\n" +
                    "        \nTony travels to New York City to carry out the assassination with Sosa\'s henchman, Shadow, who plants a radio-controlled bomb under the activist\'s car. However, when the activist is unexpectedly accompanied by his wife and children, Tony tries to call off the hit. Shadow refuses to back down, and Tony kills him before he can detonate the bomb. Tony returns to Miami, where an enraged Sosa calls him to promise retribution for allowing the activist to deliver the expose. Tony, at his mother\'s behest, tracks down Gina and finds her with Manny; in a fit of rage, Tony shoots Manny dead, after which Gina tearfully tells Tony that they were married the day before. A distraught Tony returns to his estate with Gina, and begins a massive cocaine binge in his office.\n" +
                    "        \nWhile dozens of Sosa\'s men begin to invade the estate and kill all of Tony\'s guards, Gina accuses Tony of wanting her for himself and shoots at him. One of Sosa\'s men kills her and is in turn killed by Tony. With assassins outside his office, Tony turns a grenade launcher-equipped rifle on them, mowing down many. Tony is repeatedly shot by the remaining attackers, but continues to taunt them until he is fatally shot from behind by The Skull. Tony\'s corpse falls into a fountain below, in front of a statue with the inscription \"The World is Yours\"."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.movieData = movieData

    }

    fun createToast(view: View) {
        Toast.makeText(applicationContext, "Great Movie!",
                Toast.LENGTH_SHORT).show()
    }
}