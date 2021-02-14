package com.harnet.fixit.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class User(
    val uid: String? = "",
    val name: String? = "",
    val country: String? = "",
    val district: String? = "",
    val city: String? = "",
    val email: String? = "",
    val profileImgUrl: String? = ""
)