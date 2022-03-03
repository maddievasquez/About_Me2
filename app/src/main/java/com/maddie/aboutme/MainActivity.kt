package com.maddie.aboutme
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.os.Bundle as Bundle1


//import androidx.appcompat.widget.Toolbar;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle1?) {
        // Note that the Toolbar defined in the layout has the id "my_toolbar"
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar_main) as Toolbar
        setSupportActionBar(toolbar);

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val educationBtn = findViewById<Button>(R.id.educationBtn)
        educationBtn.setOnClickListener {
            val Intent = Intent(this, EducationActivity::class.java)
            startActivity(Intent)
        }

    }
}