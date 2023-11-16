package com.zilaneleftoz.navigationcomponenthomework.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class QuestionData(
    var question1:String,
    var question2:String,
    var question3:String,
    var question4:String,
    var question5:String,

) : Parcelable