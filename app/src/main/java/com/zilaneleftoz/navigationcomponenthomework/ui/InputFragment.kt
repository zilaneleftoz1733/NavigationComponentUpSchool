package com.zilaneleftoz.navigationcomponenthomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.zilaneleftoz.navigationcomponenthomework.R
import com.zilaneleftoz.navigationcomponenthomework.common.viewBinding
import com.zilaneleftoz.navigationcomponenthomework.databinding.FragmentInputBinding

class InputFragment : Fragment(R.layout.fragment_input) {

    private val binding by viewBinding (FragmentInputBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnstart.setOnClickListener{
            val name= binding.name.text.toString()
            val surname = binding.surname.text.toString()
            val action = InputFragmentDirections.InputToPersonalInfo(name,surname)
            findNavController().navigate(action)

        }
    }
}

