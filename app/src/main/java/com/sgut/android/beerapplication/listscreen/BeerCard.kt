package com.sgut.android.beerapplication.listscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel

@Composable
fun BeerCard(beer: BeerDomainModel, modifier: Modifier) {
    Surface(shape = RoundedCornerShape(10.dp), elevation = 9.dp, modifier = modifier) {
        Column(modifier = Modifier.fillMaxWidth() ) {
            //image

            val painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(beer.imageUrl)
                    .size(125)
                    .build()
            )
           Image(painter = painter,contentDescription = beer.name, modifier = Modifier.size(200.dp))
            Text(beer.name ?: "No Name", style = MaterialTheme.typography.h1)
            Column(modifier = Modifier.padding(16.dp)) {
                Text(beer.tagline ?: "No Tagline")
            }
        }
    }

}
