package com.example.triple_kill

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triple_kill.databinding.Activity3Binding

import android.view.MenuItem
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
class Activity3 : Abstract() {
    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.bnToFirst.setOnClickListener {
            toFirst()
        }

        binding.bnToSecond.setOnClickListener {
            toSecond()
        }
        binding.navView.setNavigationItemSelectedListener(this)


    }

    override fun navigateUp() {
        finish()
    }

    private fun toFirst() {
        this.setResult(Activity.RESULT_OK)
        finish()
    }

    private fun toSecond() {
        finish()
    }
}