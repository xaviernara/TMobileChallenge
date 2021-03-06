package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Attributes(
    val font: Font?,
    val text_color: String? // #262626
) : Parcelable