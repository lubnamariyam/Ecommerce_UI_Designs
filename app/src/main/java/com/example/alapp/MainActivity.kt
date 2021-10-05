package com.example.alapp

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        window.statusBarColor = ContextCompat.getColor(this, R.color.primary_color)
        app_bar.setBackgroundColor(
            getResources().getColor(
                R.color.primary_color,
                resources.newTheme()
            )
        )
        appBarConfiguration = AppBarConfiguration(navController.graph)
        app_bar.setupWithNavController(navController,appBarConfiguration)

        // toolbar
//        setSupportActionBar(app_bar)
//
//
//        // add back arrow to toolbar
//        if (supportActionBar != null) {
//            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//            supportActionBar!!.setDisplayShowHomeEnabled(true)
//        }

        navController.addOnDestinationChangedListener { _, destination: NavDestination, _ ->
            when (destination.id) {
                R.id.splashFragment, R.id.onboardingFragment, R.id.loginFragment, R.id.registerFragment -> {
                    app_bar.visibility = View.GONE

                }
                else -> {
                    app_bar.visibility = View.VISIBLE
                }
            }
        }


    }


}

