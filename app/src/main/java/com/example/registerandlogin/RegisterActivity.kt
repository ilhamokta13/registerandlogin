package com.example.registerandlogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.registerandlogin.databinding.FragmentRegisterActivityBinding


class RegisterActivity : Fragment() {

    lateinit var binding: FragmentRegisterActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterActivityBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener{
            val name = binding.namaEditText.text.toString()
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            val confirmpass = binding.confirmPassEditText.text.toString()

            val bundle = Bundle()

            bundle.apply {
                putString("username", username)
                putString("pass", password)
            }
            findNavController().navigate(R.id.action_registerActivity_to_loginActivity2,bundle)



        }

        binding.btnlogin.setOnClickListener{
            findNavController().navigate(R.id.action_registerActivity_to_loginActivity4)
        }
    }


}