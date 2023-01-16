package com.deneme.encryptioncommantionapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deneme.encryptioncommantionapplication.Classes.RandomPasswordGenerator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dummyClass= RandomPasswordGenerator(true,true,true,18);
        println(dummyClass.randomID());

        supportActionBar?.hide();

    }
}