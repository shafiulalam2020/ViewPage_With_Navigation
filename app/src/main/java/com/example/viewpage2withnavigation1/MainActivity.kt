package com.example.viewpage2withnavigation1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar
                /** eikhane jeta ase eitar karone ActionBAR dekha jabe na **/
                ?.hide()
    }
}