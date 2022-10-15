package com.sgut.android.beerapplication.listscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape

@Composable
fun HomeSection(

    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text("title")
        content()
    }
}


//@Composable
//fun Button(
//            shape: Shape = MaterialTheme.shapes.small
//) {