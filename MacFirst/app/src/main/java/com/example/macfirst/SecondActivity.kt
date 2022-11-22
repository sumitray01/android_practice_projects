package com.example.macfirst

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Apply.setOnClickListener {
            val name = Name.text.toString()
            val age = Age.text.toString().toInt()
            val country = Country.text.toString()
            Intent(this,ThirdActivity::class.java).also {
                it.putExtra("Name1",name)
                it.putExtra("Age",age)
                it.putExtra("country",country)
                startActivity(it)
            }
        }

        var adContact =AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setIcon(R.drawable.sin)
            .setMessage("you want Sumit to contact !")
            .setPositiveButton("yes"){_,_ ->
                Toast.makeText(this,"you added sumit to contact",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){_,_ ->
                Toast.makeText(this,"Not added sumit to your contact",Toast.LENGTH_SHORT).show()
            }.create()


        b2.setOnClickListener {
            adContact.show()
        }
    }
}