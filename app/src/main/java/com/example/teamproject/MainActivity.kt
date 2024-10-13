package com.example.teamproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.teamproject.setting.Notice
import com.example.teamproject.setting.favorites

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val noticeBtn = findViewById<ImageView>(R.id.btn_notice)

        noticeBtn.setOnClickListener {
            val intent = Intent(this, Notice::class.java)
            startActivity(intent)
        }

        val favoritesBtn = findViewById<ImageView>(R.id.btn_favorites)

        favoritesBtn.setOnClickListener {
            val intent = Intent(this, favorites::class.java)
            startActivity(intent)
        }
    }
}