package com.deneme.encryptioncommantionapplication

import RandomPasswordGenerator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dummyClass= RandomPasswordGenerator(true,true,true,8);
        println("Passs test: "+dummyClass.generatePassword());

        supportActionBar?.hide();

    }
}