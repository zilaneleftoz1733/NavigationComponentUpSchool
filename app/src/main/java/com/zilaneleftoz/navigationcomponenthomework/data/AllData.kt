package com.zilaneleftoz.navigationcomponenthomework.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AllData(
    val user : UserData,
    val  question : QuestionData
)
    : Parcelable