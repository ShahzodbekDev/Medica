package com.example.medica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import com.example.medica.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val handler = Handler()
        val delayInMillis = 5000


        handler.postDelayed({

            Intent(this,IntroActivity::class.java).apply {
                startActivity(this)
                finish()
            }


        }, delayInMillis.toLong())

    }
}