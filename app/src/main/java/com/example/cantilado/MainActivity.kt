package com.example.cantilado
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val TAG = "MainActivity" as String;
        Log.v(TAG, "This is a verbose log.");
        Log.d(TAG, "This is a debug log.");
        Log.i(TAG, "This is a info log.");
        Log.w(TAG, "This is a warn log.");
        Log.e(TAG, "This is a error log.");

       val button = findViewById(R.id.button2) as Button

       button.setOnClickListener{
           Log.i(TAG, "This is a info log.");
       }

        val btn = findViewById<Button>(R.id.btn6)
        btn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}