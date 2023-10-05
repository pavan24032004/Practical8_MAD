package com.pavanpatel.p8_75_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock

class MainActivity : AppCompatActivity() {
    private lateinit var clockTC:TextClock
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clockTC = findViewById(R.id.currenttime)
        clockTC.format24Hour = "hh:mm:ss:dd:MMM:yyyy a"

    }
}