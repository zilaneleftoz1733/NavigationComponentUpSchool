package com.zilaneleftoz.navigationcomponenthomework.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserData(
    val name : String,
    val surname : String,
    val email : String,
    val phoneNumber: String,
    val city: String
) : Parcelable


