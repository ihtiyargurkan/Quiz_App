package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private var nameText : TextView? = null
    private var startButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        startButton = binding?.startButton
        nameText = binding?.nameText
        startButton?.setOnClickListener {
            if (nameText?.text?.isEmpty() == true){
                Toast.makeText(applicationContext, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                Toast.makeText(applicationContext, "Welcome ${nameText?.text.toString()}" , Toast.LENGTH_SHORT).show()
                intent.putExtra(Constants.USER_NAME,nameText?.text.toString())
                startActivity(intent)
                finish()
            }

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}