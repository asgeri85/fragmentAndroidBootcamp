package net.btpro.client.androidbootcamp7may

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.btpro.client.androidbootcamp7may.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}