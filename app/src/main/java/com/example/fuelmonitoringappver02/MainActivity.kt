package com.example.fuelmonitoringappver02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fuelmonitoringappver02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()
        val fragmentThree = FragmentThree()

        supportFragmentManager.beginTransaction().apply {
            replace(binding.frameLayout.id,fragmentTwo)
            commit()
        }
        binding.imgHome.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(binding.frameLayout.id,fragmentOne)
                commit()
            }
        }
        binding.imgFuel.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(binding.frameLayout.id,fragmentTwo)
                commit()
            }
        }
        binding.imgProfile.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(binding.frameLayout.id,fragmentThree)
                commit()
            }
        }
    }
}