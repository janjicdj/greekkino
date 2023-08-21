package com.example.example

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class RequestData(

    @SerializedName("countryId"     ) var countryId: Int?                     = null,
    @SerializedName("cutoffHours"   ) var cutoffHours: Int?                     = null,
    @SerializedName("languageId"    ) var languageId: Int?                     = null,
    @SerializedName("priorityGames" ) var priorityGames: List<PriorityGame> = arrayListOf()

):Serializable