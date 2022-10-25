package com.sgut.android.beerapplication.listscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sgut.android.beerapplication.ui.theme.BeerApplicationTheme

@Composable
fun MyBeerAp() {
    BeerApplicationTheme {
        Scaffold(
            bottomBar = { BottomBeerNavigation() }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))

        }
    }
}