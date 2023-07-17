package com.example.mybillassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mybillassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnNext.setOnClickListener {
            validateRegistration()
        }
    }
    fun validateRegistration() {
        val name = binding.etusername.text.toString()
        val phonenumber =binding.etPhonenumber.text.toString()
        val email=binding.etpassword.text.toString()
        val password =binding.etemailaddress .text.toString()
        var error = false
        if (name.isBlank()) {
            binding.tilusername.error = "Name required"
            error=true
        }
        if (name.isBlank()) {
            binding.tilPhonenumber.error = "Phonenumber required"
            error=true
        }
        if (name.isBlank()) {
            binding.tilemailaddress.error = "Email required"
            error=true
        }
        if (name.isBlank()) {
            binding.tilpassword.error = "Password required"
            error=true

        }
        if (!error){
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}
