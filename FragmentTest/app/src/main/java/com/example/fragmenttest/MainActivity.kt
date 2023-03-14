package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_1.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun fragment_1(view :View)
    {
        val fragment_manager =supportFragmentManager
        val fragment_transaction = fragment_manager.beginTransaction()
        val frag1 =Fragment1()


        fragment_transaction.replace(R.id.frL,frag1,).commit()

    }
    fun fragment_2(view :View)
    {
        val fragment_manager =supportFragmentManager
        val fragment_transaction = fragment_manager.beginTransaction()
        val frag2 =Fragment2()


        fragment_transaction.replace(R.id.frL,frag2,).commit()

    }

}