package com.example.gitlearning2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(hesabla())
        println("Qurban")

    }



    fun hesabla():Int{
        return 10
    }
}