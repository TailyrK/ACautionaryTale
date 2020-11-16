package com.example.cautionarytale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fab: View = findViewById(R.id.floatingActionButton)
        fab.setOnClickListener { View ->
            val intent = Intent(this, endOfStory::class.java)
            startActivity(intent)
        }
    }
}