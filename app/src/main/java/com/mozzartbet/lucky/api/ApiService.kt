package com.example.weather.api

import com.example.example.AllOffers
import com.example.example.Offer
import com.example.example.RequestData
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @Headers("Content-type:application/json;charset=UTF-8")
    @POST("/MozzartWS/external.json/lotto-offer-complete")
    fun getGames(@Body reqData: RequestData): Call<AllOffers>

}