package com.example.worldgiantclock

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button for setting
        val btnSetting: FloatingActionButton = findViewById(R.id.btn_setting)
        btnSetting.setOnClickListener {
            val i = Intent(this, SettingsActivity::class.java)
            startActivity(i)
        }
    }
}