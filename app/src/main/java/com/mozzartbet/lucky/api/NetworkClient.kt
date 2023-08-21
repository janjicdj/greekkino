package com.example.weather.api

import com.example.example.AllOffers
import com.example.example.PriorityGame
import com.example.example.RequestData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkClient {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.mozzartbet.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    suspend fun getData(): AllOffers?{
        val reqData = RequestData(
            countryId = 1,
            cutoffHours = 24,
            languageId = 1,
            priorityGames = listOf(
                PriorityGame(26, 20, 1),
                PriorityGame(58, 20, 2),
                PriorityGame(90, 20, 3),
                PriorityGame(91, 20, 4),
                PriorityGame(86, 20, 5),
                PriorityGame(89, 20, 6),
                PriorityGame(88, 20, 7)
            )
        )
        return withContext(Dispatchers.IO) {
            val response = retrofit.getGames(reqData).execute()
            if (response.isSuccessful) {
                response.body()
            } else {
                null
            }
        }
    }

}