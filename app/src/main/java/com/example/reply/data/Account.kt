package com.example.reply.data

import androidx.annotation.DrawableRes

data class Account(
    val id: Int,
    val firstName: String,
    val email: String,
    @DrawableRes val avatar: Int
) {
    /** User's full name **/
    val fullName: String = "$firstName+$firstName"
}
