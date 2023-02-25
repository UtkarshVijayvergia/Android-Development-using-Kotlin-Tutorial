package com.example.click_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        val buttonClicker: Button = findViewById(R.id.button1)
        val textChanger: TextView = findViewById(R.id.textView)

        buttonClicker.setOnClickListener{
            counter++
            textChanger.text = counter.toString()
        }
    }
}