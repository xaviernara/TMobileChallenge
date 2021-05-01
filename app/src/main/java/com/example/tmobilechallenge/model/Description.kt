package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Description(
    val attributes: AttributesX?,
    val value: String? // Offers available every week!
) : Parcelable