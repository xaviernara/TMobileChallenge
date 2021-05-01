package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Size(
    val height: Int?, // 1498
    val width: Int? // 1170
) : Parcelable