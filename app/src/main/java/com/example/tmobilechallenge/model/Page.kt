package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Page(
    val cards: List<Card>?
) : Parcelable