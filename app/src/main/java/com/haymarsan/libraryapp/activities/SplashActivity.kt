package com.haymarsan.libraryapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.haymarsan.libraryapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

       Handler().postDelayed({
           startActivity(MainActivity.newIntent(this))
           finish()
       }, 2000)
    }
}
