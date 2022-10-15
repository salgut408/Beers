package com.sgut.android.beerapplication.listscreen

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.ui.Alignment
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel

@Composable
fun BeerCard2() {

}

@Composable
fun BeerCard(beer: BeerDomainModel, modifier: Modifier) {
    Card(shape = RoundedCornerShape(10.dp), elevation = 9.dp, modifier = modifier,) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth(), ) {
            //image

            val painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(beer.imageUrl)
                    .crossfade(true)
                    .build()
            )
           Image(painter = painter,contentDescription = beer.name, modifier = Modifier.size(150.dp))


            Column(modifier = Modifier.padding(16.dp)) {
                Text(beer.name ?: "No Name", style = MaterialTheme.typography.h4)
                Text(beer.tagline ?: "No Tagline", style = MaterialTheme.typography.h6)
                Text("Pair with")
                for(ingredient in beer.foodPairing!!){
                    Text(ingredient ?: "No Tagline",   )
                }

            }
        }
    }

}
