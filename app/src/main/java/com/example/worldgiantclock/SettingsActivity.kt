package com.example.worldgiantclock

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // the title of our action bar.
        supportActionBar!!.title = "Settings"

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, SettingsFragment())
            .commit()
    }
}
