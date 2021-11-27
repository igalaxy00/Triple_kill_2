package com.example.triple_kill

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.triple_kill.databinding.Activity1Binding
import com.google.android.material.navigation.NavigationView

class Activity1 : Abstract() {

    private lateinit var binding: Activity1Binding
    override fun navigateUp() {}

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener {
            toSecond()
        }
        binding.navView.setNavigationItemSelectedListener(this)

    }


    private fun toSecond() {
        startActivity(Intent(this, Activity2::class.java))
    }

}