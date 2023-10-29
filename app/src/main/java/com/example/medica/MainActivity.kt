package com.example.medica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.medica.databinding.ActivityMainBinding
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.waitSpin.startAnimation(AnimationUtils.loadAnimation(this,R.anim.wait_spin_anim))

        val handler = Handler()
        val delayInMillis = 5000


        handler.postDelayed({

        Intent(this,WelcomeActivity::class.java).apply {
            startActivity(this)
            finish()
        }


        }, delayInMillis.toLong())





    }
}