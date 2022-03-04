package com.maddie.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar_main) as Toolbar
//        val toolbarTextView = findViewById<View>(android.R.id.toolbarTextView) as TextView
        setSupportActionBar(toolbar);


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)
        val educationBtn = findViewById<Button>(R.id.educationBtn)
        educationBtn.setOnClickListener {
            val Intent = Intent(this, EducationActivity::class.java)
            startActivity(Intent)
        }

    }

    }
