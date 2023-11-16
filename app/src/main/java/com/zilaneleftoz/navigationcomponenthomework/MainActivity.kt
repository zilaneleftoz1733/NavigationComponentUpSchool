package com.zilaneleftoz.navigationcomponenthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zilaneleftoz.navigationcomponenthomework.common.viewBinding
import com.zilaneleftoz.navigationcomponenthomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding (ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}