package com.example.macfirst

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
             val f1=first.text.toString().toInt()
             val f2=second.text.toString().toInt()
            var r = f1+f2
            result.setText(r.toString())

            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }


        }
    }

    override fun onPause() {
        Toast.makeText(this, "on pause call ", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

}