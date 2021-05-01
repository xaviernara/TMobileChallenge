package com.example.tmobilechallenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass

@Entity(tableName ="TMobile_Response_Table")
@JsonClass(generateAdapter = true)
@Parcelize
data class TMobileResponse(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val page: Page?
) : Parcelable