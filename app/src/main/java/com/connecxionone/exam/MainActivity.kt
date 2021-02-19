package com.connecxionone.exam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.connecxionone.exam.databinding.ActivityMainBinding
import com.hi.dhl.binding.viewbind

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewbind()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(binding) {
            setContentView(root)

            findNavController(R.id.nav_host_fragment)
                .let {
                    navView.setupWithNavController(it)
                }
        }
    }
}