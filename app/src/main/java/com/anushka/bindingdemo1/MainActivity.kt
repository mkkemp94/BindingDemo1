package com.anushka.bindingdemo1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo1.databinding.ActivityMainBinding

/**
 *
 * To use data binding:
 *
 * 1. Enable data binding in Gradle
 * 2. Wrap XML with layout tags
 * 3. Construct a data binding object in the activity
 * 4. Eliminate findViewById()
 *
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.apply {
            val message = "Hello! " + nameEditText.text
            greetingTextView.text = message
        }

    }
}
