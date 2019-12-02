package com.example.leakeyrenahgamedecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private val sportList = arrayListOf("Motorboat Racing","Motorcycle Racing","Weightlifting","Diving","Rowing")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomSport = random.nextInt(sportList.count())
            selectedGameTxt.text = sportList[randomSport]
        }

        addSportBtn.setOnClickListener {
            val newSport = addGameTxt.text.toString()
            sportList.add(newSport)
            addGameTxt.text.clear()
        }
    }
}
