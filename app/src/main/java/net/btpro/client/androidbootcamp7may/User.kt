package net.btpro.client.androidbootcamp7may

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val age: String
):Parcelable
