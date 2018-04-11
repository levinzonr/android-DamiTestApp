package cz.levinzonr.damiapp.view

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import cz.levinzonr.damiapp.R
import cz.levinzonr.damiapp.model.local.DamiLocalDatasource
import kotlinx.android.synthetic.main.activity_signed_in.*
import kotlinx.android.synthetic.main.app_bar_signed_in.*

class SignedInActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signed_in)
        setSupportActionBar(toolbar)
        val local = DamiLocalDatasource(this)

        if (!local.isLoggedIn()) {
            val intent = Intent(this, NotSignedActivity::class.java)
            startActivity(intent)
            finish()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
         }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}