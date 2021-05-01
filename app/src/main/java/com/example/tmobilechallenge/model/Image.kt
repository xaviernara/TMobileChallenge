package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Image(
    val size: Size?,
    val url: String? // https://qaevolution.blob.core.windows.net/assets/ios/3x/Featured@4.76x.png
) : Parcelable