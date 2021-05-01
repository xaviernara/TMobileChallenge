package com.example.tmobilechallenge.repo

import com.example.tmobilechallenge.model.TMobileResponse
import retrofit2.http.GET

interface TMobileService {

    @GET("/home")
    suspend fun getTMobileService():TMobileResponse



}