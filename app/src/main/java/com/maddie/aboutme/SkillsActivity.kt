package com.maddie.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)


        val homeBtn = findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val educationBtn = findViewById<Button>(R.id.educationBtn)
        educationBtn.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        val hobbiesBtn = findViewById<Button>(R.id.hobbiesBtn)
        hobbiesBtn.setOnClickListener {
            val Intent = Intent(this, Hobbies_Activity::class.java)
            startActivity(Intent)
        }
    }
}