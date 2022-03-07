package com.maddie.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Hobbies_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_hobbies)
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        supportActionBar!!.setTitle("Hobbies")


        val skillsBtn = findViewById<Button>(R.id.skillsBtn)
        skillsBtn.setOnClickListener {
            val intent= Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val homeBtn = findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val achievementsBtn = findViewById<Button>(R.id.achievementsBtn)
        achievementsBtn.setOnClickListener {
            val intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }
    }
}