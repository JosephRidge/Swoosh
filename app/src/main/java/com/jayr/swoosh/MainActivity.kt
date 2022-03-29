package com.jayr.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedButton = findViewById<ToggleButton>(R.id.getstarted_button)
        getStartedButton.setOnClickListener {
            val leagueContent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueContent)
        }
    }
}