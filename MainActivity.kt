package com.example.digitalclock // Replace with your actual package name

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var tvDigitalClock: TextView
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var timeRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDigitalClock = findViewById(R.id.tvDigitalClock)

        // Initialize the Runnable to update the time every second
        timeRunnable = object : Runnable {
            override fun run() {
                // Get current time formatted as HH:mm:ss
                val currentTime = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
                tvDigitalClock.text = currentTime

                // Re-run this runnable after 1 second (1000 milliseconds)
                handler.postDelayed(this, 1000)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        // Start the clock updates when the activity comes to the foreground
        handler.post(timeRunnable)
    }

    override fun onPause() {
        super.onPause()
        // Stop the updates when the activity goes to the background to save resources
        handler.removeCallbacks(timeRunnable)
    }
}