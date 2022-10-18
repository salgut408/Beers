package com.sgut.android.beerapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sgut.android.beerapplication.listscreen.AlignYourBeerRow
import com.sgut.android.beerapplication.listscreen.BeerList
import com.sgut.android.beerapplication.listscreen.MainToolBar
import com.sgut.android.beerapplication.listscreen.SearchBar
import com.sgut.android.beerapplication.ui.theme.BeerApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeerApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        // 2
                        MainToolBar()
                        SearchBar()
//                        BeerList()
                        AlignYourBeerRow()
                }
            }
        }
    }
}}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BeerApplicationTheme {
        Greeting("Android")
    }
}