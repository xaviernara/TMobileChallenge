package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class AttributesX(
    val font: FontX?,
    val text_color: String? // #262626
) : Parcelable