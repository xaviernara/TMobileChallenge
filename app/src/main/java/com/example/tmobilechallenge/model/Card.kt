package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Card(
    val card: CardX?,
    val card_type: String? // text
) : Parcelable