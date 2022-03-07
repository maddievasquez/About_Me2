package com.maddie.aboutme
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar_main)
//        val toolbarTextView = findViewById<View>(android.R.id.toolbarTextView) as TextView
//        setSupportActionBar(toolbar)
        //actionbar
//        val actionbar = supportActionBar
        //set actionbar title
        //set back button
//        actionbar!!.setDisplayHomeAsUpEnabled(true)
//        actionbar.setDisplayHomeAsUpEnabled(true)
//        super.onBackPressed();

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)
        val skillsBtn = findViewById<Button>(R.id.skillsBtn)
        skillsBtn.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        val homeBtn = findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        }
        }



//        override fun onSupportNavigateUp(): Boolean {
//            onBackPressed()
//            return true
//        }


