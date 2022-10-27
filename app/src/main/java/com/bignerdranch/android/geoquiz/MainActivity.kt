package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Get references to the views.
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    // Call function when instance of subclass is created.
    override fun onCreate(savedInstanceState: Bundle?) {

        // When called, manage this User Interface (UI).
        super.onCreate(savedInstanceState)

        // Give activity a UI, inflate a layout to the screen.
        setContentView(R.layout.activity_main)

        // Refer to the inflated views.
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        // Create event listeners.
        trueButton.setOnClickListener { view : View ->
            // Create and configure the Toast object
            // ( Context parameter, resource id, visibility length )
            Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()
        }

        falseButton.setOnClickListener { view : View ->
            Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT)
        }
    }
}