package com.example.lab03_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val btnToActivity3 = findViewById<View>(R.id.btn2third)
        btnToActivity3.setOnClickListener {
            val intent = Intent(applicationContext, Activity3::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            startActivity(intent)
        }

        val btnToActivity2 = findViewById<View>(R.id.btn2second)
        btnToActivity2.setOnClickListener {
            val intent = Intent(applicationContext, Activity2::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            startActivity(intent)
        }
        val navBottom : BottomNavigationView = findViewById<View>(R.id.nav_bottom) as BottomNavigationView
            navBottom.setOnNavigationItemReselectedListener {
            startActivity(Intent(applicationContext, ActivityAbout::class.java))
        }
    }
}