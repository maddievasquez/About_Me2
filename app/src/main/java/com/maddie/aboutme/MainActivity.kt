package com.maddie.aboutme

import android.app.ActionBar
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.os.Bundle as Bundle1


//import androidx.appcompat.widget.Toolbar;

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle1?) {
        

        // Note that the Toolbar defined in the layout has the id "my_toolbar"
        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar_main) as Toolbar
//        val toolbarTextView = findViewById<View>(android.R.id.toolbarTextView) as TextView
        setSupportActionBar(toolbar);

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val educationBtn = findViewById<Button>(R.id.educationBtn)
        educationBtn.setOnClickListener {
            val Intent = Intent(this, EducationActivity::class.java)
            startActivity(Intent)
        }
        val skillsBtn = findViewById<Button>(R.id.skillsBtn)
        skillsBtn.setOnClickListener {
            val Intent = Intent(this, SkillsActivity::class.java)
            startActivity(Intent)
        }
        val hobbiesBtn = findViewById<Button>(R.id.hobbiesBtn)
        hobbiesBtn.setOnClickListener {
            val Intent = Intent(this, HobbiesActivity::class.java)
            startActivity(Intent)
        }
        val achievementsBtn = findViewById<Button>(R.id.achievementsBtn)
        achievementsBtn.setOnClickListener {
            val Intent = Intent(this, AchievementsActivity::class.java)
            startActivity(Intent)
        }

    }
}


}
