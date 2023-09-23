package com.example.practical4_5b_6_22012022013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun signup(view: View) {
        intent = Intent(this,SignUp::class.java)
        startActivity(intent)
    }
    fun Login(view: View) {
        intent = Intent(this,Login::class.java)
        startActivity(intent)
    }

}