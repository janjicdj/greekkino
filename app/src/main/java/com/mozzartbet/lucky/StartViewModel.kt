package com.mozzartbet.lucky

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.example.AllOffers
import com.example.weather.api.NetworkClient
import com.mozzartbet.lucky.dto.dtoPomocneKlase.Base
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class StartViewModel: ViewModel() {

    val allOffers = mutableStateOf<AllOffers?>(null)
    private var tabSelected = mutableIntStateOf(0)

    var content: MutableStateFlow<ArrayList<Base>> = MutableStateFlow(ArrayList())



    fun loadData() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = NetworkClient.getData()
            allOffers.value = result
            Log.i("tag", "$allOffers")
        }
    }

}