package com.example.registerandlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.registerandlogin.databinding.FragmentHomeActivityBinding

class HomeActivity : Fragment() {

    lateinit var binding : FragmentHomeActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeActivityBinding.inflate(layoutInflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getusername= arguments?.getString("username")
        binding.userEditText.text = "$getusername"

        binding.profileButton.setOnClickListener {
            val bundle = bundleOf("username" to getusername)

            findNavController().navigate(R.id.action_homeActivity_to_profileActivity)
        }

    }


}