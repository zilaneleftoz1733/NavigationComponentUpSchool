package com.zilaneleftoz.navigationcomponenthomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.zilaneleftoz.navigationcomponenthomework.R
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.zilaneleftoz.navigationcomponenthomework.common.viewBinding
import com.zilaneleftoz.navigationcomponenthomework.data.AllData
import com.zilaneleftoz.navigationcomponenthomework.data.QuestionData
import com.zilaneleftoz.navigationcomponenthomework.databinding.ActivityMainBinding.bind
import com.zilaneleftoz.navigationcomponenthomework.databinding.FragmentQuestionPageBinding


class QuestionPageFragment : Fragment(R.layout.fragment_question_page) {

    private val binding by viewBinding(FragmentQuestionPageBinding::bind)
    private val args by navArgs<QuestionPageFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.name.text= args.nameUser.name
        binding.surnama.text= args.nameUser.surname



        binding.btnEnd.setOnClickListener {
            val et_question1 = binding.questions1.text.toString()
            val et_question2 = binding.questions2.text.toString()
            val et_question3 = binding.questions3.text.toString()
            val et_question4 = binding.questions4.text.toString()
            val et_question5 = binding.questions5.text.toString()
            val question = QuestionData(et_question1, et_question2,et_question3,et_question4,et_question5)
            val allData = AllData(args.nameUser,question)
            val action =QuestionPageFragmentDirections.QuestionPageToFinish(allData)


            findNavController().navigate(action)
        }
        binding.imageButton.setOnClickListener{
            findNavController().navigateUp()
        }
    }

}