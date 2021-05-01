package com.example.tmobilechallenge.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TMobileModule {







    private val client = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        .let { loginInterceptor ->
            OkHttpClient.Builder().addInterceptor(loginInterceptor).build()
        }


    @Provides
    @Singleton
    fun providesRefrofitInstance(): Retrofit {

        return Retrofit.Builder().baseUrl("https://private-8ce77c-tmobiletest.apiary-mock.com/test")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client).build()


    }
}