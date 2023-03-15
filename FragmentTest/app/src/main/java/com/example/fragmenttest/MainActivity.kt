package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fragmenttest.databinding.ActivityMainBinding
import com.example.fragmenttest.databinding.Fragment1Binding
import kotlinx.android.synthetic.main.fragment_1.*

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
  //  val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding?.fg1?.setOnClickListener {
            fragment_1(it)
        }
      binding?.fg2?.setOnClickListener {
          fragment_2(it)
      }


    }

    fun fragment_1(view: View) {
        val fragment_manager = supportFragmentManager
        val fragment_transaction = fragment_manager.beginTransaction()
        val frag1 = Fragment1()


        fragment_transaction.replace(R.id.frL, frag1).commit()

    }

    fun fragment_2(view: View) {
        val fragment_manager = supportFragmentManager
        val fragment_transaction = fragment_manager.beginTransaction()
        val frag2 = Fragment2()


        fragment_transaction.replace(R.id.frL, frag2).commit()

    }

}