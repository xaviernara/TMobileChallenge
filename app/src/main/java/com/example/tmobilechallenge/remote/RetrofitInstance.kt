package com.example.tmobilechallenge.remote

import com.example.tmobilechallenge.repo.TMobileService
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitInstance @Inject constructor(private val retrofitInstance: Retrofit){

    val tMobileService : TMobileService by lazy{retrofitInstance.create(TMobileService::class.java)}
}