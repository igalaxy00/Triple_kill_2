package com.example.triple_kill

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.triple_kill.databinding.Activity2Binding
import com.google.android.material.navigation.NavigationView

class Activity2 : Abstract() {
    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.bnToFirst.setOnClickListener {
            toFirst()
        }

        binding.bnToThird.setOnClickListener {
            toThird()
        }
        binding.navView.setNavigationItemSelectedListener(this)



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RESULT_CODE && resultCode == Activity.RESULT_OK) {
            finish()
        }
    }

    override fun navigateUp() {
        finish()
    }

    private fun toFirst() {
        finish()
    }

    private fun toThird() {
        startActivityForResult(Intent(this, Activity3::class.java), RESULT_CODE)
    }

    companion object {
        const val RESULT_CODE = 0
    }
}