package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class CardX(
    val attributes: Attributes?,
    val description: Description?,
    val image: Image?,
    val title: Title?,
    val value: String? // Hello, Welcome to App!
) : Parcelable