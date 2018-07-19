package com.raywenderlich.marsrovers.service

import com.raywenderlich.marsrovers.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NasaApi {
    @GET("mars-photos/api/v1/rovers/{rover}/photos?sol=1000&api_key=FKq3UD3P7yCDXGeaaBRgWTm4FTffWUv07pali3b1")
    fun getPhotos(@Path("rover") rover: String): Call<PhotoList>
}