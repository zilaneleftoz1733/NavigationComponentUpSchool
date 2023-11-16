package com.zilaneleftoz.navigationcomponenthomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.zilaneleftoz.navigationcomponenthomework.R
import com.zilaneleftoz.navigationcomponenthomework.common.viewBinding
import com.zilaneleftoz.navigationcomponenthomework.data.UserData
import com.zilaneleftoz.navigationcomponenthomework.databinding.FragmentPersonalInfoBinding


class PersonalInfo : Fragment(R.layout.fragment_personal_info) {

    private val binding by viewBinding (FragmentPersonalInfoBinding::bind)
    private val args by navArgs<PersonalInfoArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.name.text= args.name
        binding.surname.text= args.surname

        binding.btnDevam.setOnClickListener{
            val email = binding.email.text.toString()
            val city = binding.city.text.toString()
            val phoneNumber=binding.phoneNumber.text.toString()
            val data = UserData(args.name,args.surname,email,city,phoneNumber)
            val action = PersonalInfoDirections.PersonalInfoToQuestionsPage(data)
            findNavController().navigate(action)
        }
        binding.imageButton.setOnClickListener{
            findNavController().navigateUp()
        }

    }


}
