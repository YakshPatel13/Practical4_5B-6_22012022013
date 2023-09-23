package com.example.practical4_5b_6_22012022013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun signup(view: View) {
        intent = Intent(this,SignUp::class.java)
        startActivity(intent)
    }

}