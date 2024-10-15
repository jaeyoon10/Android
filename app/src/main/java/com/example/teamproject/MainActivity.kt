package com.example.teamproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.teamproject.setting.Human
import com.example.teamproject.setting.Notice
import com.example.teamproject.setting.favorites

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 공지사항으로 화면 전환 코드 */

        val noticeBtn = findViewById<ImageView>(R.id.btn_notice)

        noticeBtn.setOnClickListener {
            val intent = Intent(this, Notice::class.java)
            startActivity(intent)
        }

        /* 즐겨찾기로 화면 전환 코드 */

        val favoritesBtn = findViewById<ImageView>(R.id.btn_favorites)

        favoritesBtn.setOnClickListener {
            val intent = Intent(this, favorites::class.java)
            startActivity(intent)
        }

        /* 개인 정보로 화면 전환 코드 */

        val HumanBtn = findViewById<ImageView>(R.id.btn_human)

        HumanBtn.setOnClickListener {
            val intent = Intent(this, Human::class.java)
            startActivity(intent)
        }
    }
}