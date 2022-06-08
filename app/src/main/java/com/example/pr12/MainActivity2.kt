package com.example.pr12

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity1(view: View){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
}