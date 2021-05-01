package com.example.tmobilechallenge.repo.local

import androidx.room.TypeConverter
import com.example.tmobilechallenge.model.Page
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class Converters {

    //Converter for Page object to String for insertion of custom objects into the Room DB
    @TypeConverter
    fun pageToString(page: Page): String {
        val type = Types.newParameterizedType(Page::class.java)
        val adapter = Moshi.Builder().build().adapter<Page>(type)
        return adapter.toJson(page)
    }

    //Converter for String to Page object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToPage(jsonString: String): Page? {
        val type = Types.newParameterizedType(Result::class.java)
        val adapter = Moshi.Builder().build().adapter<Page>(type)
        return adapter.fromJson(jsonString)
    }



}