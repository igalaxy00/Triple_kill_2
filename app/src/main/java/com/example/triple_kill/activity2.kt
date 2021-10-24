package com.example.triple_kill

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triple_kill.databinding.Activity2Binding
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class activity2 : AppCompatActivity() {
    companion object {
        private const val ONLY_REQUEST = 0;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toThird.setOnClickListener {
            goToThird()
        }

        binding.toFirst.setOnClickListener {
            finish()
        }

        binding.toAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToThird() {
        val intent = Intent(this, activity3::class.java)
        startActivityForResult(intent, ONLY_REQUEST)
    }

    private fun goToAbout() {
        val intent = Intent(this, activityAbout::class.java)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == 1) {
            finish()
        }
    }
}