package com.zilaneleftoz.navigationcomponenthomework.ui

import android.os.Bundle
import android.system.Os.bind
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.zilaneleftoz.navigationcomponenthomework.R
import com.zilaneleftoz.navigationcomponenthomework.common.viewBinding
import com.zilaneleftoz.navigationcomponenthomework.databinding.FragmentFinishBinding

class FinishFragment : Fragment(R.layout.fragment_finish) {

    private val binding by viewBinding (FragmentFinishBinding :: bind )
    private val args by navArgs<FinishFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.etName.text  =args.name.user.name
        binding.etSurname.text = args.name.user.surname
        binding.etPhoneNumber.text = args.name.user.phoneNumber
        binding.etEmail.text = args.name.user.email
        binding.etCity.text = args.name.user.city
        binding.etQuestion1.text = args.name.question.question1
        binding.etQuestion2.text = args.name.question.question2
        binding.etQuestions3.text = args.name.question.question3
        binding.etQuestion4.text = args.name.question.question4

        binding.button.setOnClickListener{
            findNavController().popBackStack(R.id.InputFragment,true)
        }
    }
}
