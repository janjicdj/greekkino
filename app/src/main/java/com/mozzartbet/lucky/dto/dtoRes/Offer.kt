package com.example.example

import com.google.gson.annotations.SerializedName


data class Offer (
    @SerializedName("gameId"     ) var gameId     : Int?                  = null,
    @SerializedName("gameName"   ) var gameName   : String?               = null,
    @SerializedName("lottoOffer" ) var lottoOffer : ArrayList<LottoOffer> = arrayListOf()
)