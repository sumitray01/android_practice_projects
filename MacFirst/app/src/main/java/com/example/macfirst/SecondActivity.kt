package com.example.macfirst

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {
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

        var adContact = AlertDialog.Builder(this)
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

        var option = arrayOf("option1","option2","option3","option4")
        var singleDilog =AlertDialog.Builder(this)
            .setTitle("Select option")
            .setSingleChoiceItems(option,0) { dialogInterface,i->
                Toast.makeText(this,"${option[i]} selected",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accepted"){_,_ ->
            Toast.makeText(this,"you accepted ",Toast.LENGTH_SHORT).show()
        }
            .setNegativeButton("Decline"){_,_ ->
                Toast.makeText(this,"you Decline",Toast.LENGTH_SHORT).show()
            }.create()
        b1.setOnClickListener {
            singleDilog.show()
        }

        var multiCheck =AlertDialog.Builder(this)
            .setTitle("Please select Item from list !")
            .setMultiChoiceItems(option, booleanArrayOf(false,false,false,false)){_,i,b->
                if (b){
                Toast.makeText(this,"you select  ${option[i]}",Toast.LENGTH_SHORT).show()
                }
                else
                {Toast.makeText(this,"you deselect ${option[i]} ",Toast.LENGTH_SHORT).show()}
            }
            .setPositiveButton("Accept"){_,_ ->
                Toast.makeText(this,"You Accept",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_,_ ->
                Toast.makeText(this,"you Decline",Toast.LENGTH_SHORT).show()
            }.create()


        b3.setOnClickListener {
            multiCheck.show()
        }
    }
}