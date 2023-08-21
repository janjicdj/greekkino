package com.example.example

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class PriorityGame (

  @SerializedName("gameId"         ) var gameId         : Int? = null,
  @SerializedName("numberOfRounds" ) var numberOfRounds : Int? = null,
  @SerializedName("priority"       ) var priority       : Int? = null

):Serializable