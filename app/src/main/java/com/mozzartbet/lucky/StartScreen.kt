package com.mozzartbet.lucky

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartScreen(
    viewModel: StartViewModel,
) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        val sampleList = listOf("Prvi element", "Drugi element", "Treći element")
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            viewModel.allOffers.value?.let {
                items(it.completeOffer) { item ->
                    // Prikazi svaki element liste
                    Text(text = item.gameName.toString())
                }
            }
        }
    }


}