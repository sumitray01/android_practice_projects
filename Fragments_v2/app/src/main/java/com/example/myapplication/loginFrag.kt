package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentLoginBinding
import java.util.zip.Inflater

class loginFrag : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.loginBtn.setOnClickListener {

            findNavController().navigate(R.id.action_loginFrag_to_mainFragment)

        }
        binding.signUpBtn.setOnClickListener {

            findNavController().navigate(R.id.action_loginFrag_to_singnUpFragment)

        }
        binding.guestBtn.setOnClickListener {

            findNavController().navigate(R.id.action_loginFrag_to_guestFragment)

        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}