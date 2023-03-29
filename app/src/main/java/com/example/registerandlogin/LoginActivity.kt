package com.example.registerandlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.registerandlogin.databinding.FragmentLoginActivityBinding


class LoginActivity : Fragment() {

    lateinit var binding :FragmentLoginActivityBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginActivityBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnLogin.setOnClickListener{
            val getusername = arguments?.getString("username")
            val getpassword = arguments?.getString("pass")
            binding.usernameEditText.setText(getusername)
            binding.passwordEditText.setText(getpassword)

            val bundle = bundleOf(
                "username" to getusername,
                "password" to getpassword

            )
            findNavController().navigate(R.id.action_loginActivity_to_homeActivity)


        }

       binding.ButtonSignUp.setOnClickListener{
           findNavController().navigate(R.id.action_loginActivity_to_registerActivity)
       }
    }


}