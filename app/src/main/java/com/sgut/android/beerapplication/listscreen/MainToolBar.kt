package com.sgut.android.beerapplication.listscreen

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MainToolBar() {
    TopAppBar(title = {
        Text("Beer!",)
    })
}