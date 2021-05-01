package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class TMobileResponse(
    val page: Page?
) : Parcelable