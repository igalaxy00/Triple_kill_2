package com.example.triple_kill

import android.app.Activity
import android.content.Intent
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

abstract class Abstract: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    protected abstract fun navigateUp()

    protected fun toAbout() {
        startActivity(Intent(this, ActivityAbout::class.java))
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.bringToFront()
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return when (item.itemId) {
            R.id.activityAbout -> {
                toAbout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        navigateUp()
        return true
    }
}