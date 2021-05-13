package com.tbc_asignment_four

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.RotateAnimation
import android.widget.ImageView


class MainActivity : AppCompatActivity() {


    private lateinit var ufoThree: ImageView
    private lateinit var asteroidThre: ImageView
    private lateinit var asteroidFour: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ufoThree = findViewById(R.id.ufo_three)


        asteroidThre = findViewById(R.id.asteroid_three)
        asteroidFour = findViewById(R.id.asteroid_four)


        val rotateRight = RotateAnimation(100f, 800f,  500f, 1000f)




        rotateRight.duration = 6000
        rotateRight.repeatCount = 50
        ufoThree.startAnimation(rotateRight)
        asteroidFour.startAnimation(rotateRight)
        asteroidThre.startAnimation(rotateRight)









    }



    private fun anim(prm: ImageView){

    }


}