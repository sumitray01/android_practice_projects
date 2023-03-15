package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSingnUpBinding


class singnUpFragment : Fragment() {
    private var _binding: FragmentSingnUpBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSingnUpBinding.inflate(inflater, container, false)
        binding.guestBtn2.setOnClickListener {
            findNavController().navigate(R.id.action_singnUpFragment_to_guestFragment)

        }
        binding.signUpBtn2.setOnClickListener {
            findNavController().navigate(R.id.action_singnUpFragment_to_mainFragment)

        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}