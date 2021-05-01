package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Title(
    val attributes: AttributesXX?,
    val value: String? // Check out our App every week for exciting offers.
) : Parcelable