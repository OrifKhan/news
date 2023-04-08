package com.example.retrafit2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.retrafit2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navFragment =
            supportFragmentManager.findFragmentById(binding.fragmentsContainer.id) as NavHostFragment
        val navController = navFragment.navController
/*val db = DatabaseRoom.getInstance(this).dao()*/



    }
}


