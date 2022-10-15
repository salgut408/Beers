package com.sgut.android.beerapplication.listscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sgut.android.beerapplication.R

@Composable
fun AlignYourBeerRow(
    modifier: Modifier = Modifier,
    beerViewModel: BeerViewModel = hiltViewModel(),
) {
    val beerList by remember {beerViewModel.allBeersList}

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(items = beerList ) { beer ->
            AlignYourBeerElement(beer)
        }
    }

}

val alignYourBeerData = listOf(
    R.drawable.ic_baseball_background,

        )