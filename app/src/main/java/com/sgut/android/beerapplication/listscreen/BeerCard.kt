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
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel

@Composable
fun BeerCard(beer: BeerDomainModel, modifier: Modifier) {
    Card(shape = RoundedCornerShape(10.dp), elevation = 9.dp, modifier = modifier,) {
        Row(modifier = Modifier.fillMaxWidth() ) {
            //image

            val painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(beer.imageUrl)
                    .size(60)

                    .build()
            )
           Image(painter = painter,contentDescription = beer.name, modifier = Modifier.size(200.dp))



            Column(modifier = Modifier.padding(16.dp)) {
                Text(beer.name ?: "No Name", style = MaterialTheme.typography.h5)
                Text(beer.tagline ?: "No Tagline")

            }
        }
    }

}
