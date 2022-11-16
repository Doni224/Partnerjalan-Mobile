package com.example.scrollpartner

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screnn)

        handler=Handler()
        handler.postDelayed({
            val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            finish()
        }, 900)
    }
}