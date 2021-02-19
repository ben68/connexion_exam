package com.connecxionone.exam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.connecxionone.exam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            findNavController(R.id.nav_host_fragment).let {
                navView.setupWithNavController(it)
            }
        }
    }
}