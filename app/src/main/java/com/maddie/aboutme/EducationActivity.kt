package com.maddie.aboutme
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar_main)
//        val toolbarTextView = findViewById<View>(android.R.id.toolbarTextView) as TextView
        setSupportActionBar(toolbar)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "New Activity"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        super.onBackPressed();


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)
        val educationBtn = findViewById<Button>(R.id.educationBtn)
        educationBtn.setOnClickListener {
            val Intent = Intent(this, EducationActivity::class.java)
            startActivity(Intent)
        }
        fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
    }

    }
