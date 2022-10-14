package com.sgut.android.beerapplication.listscreen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel
import com.sgut.android.beerapplication.repository.BeerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BeerViewModel @Inject constructor (
    private  val beerRepository: BeerRepository
        ): ViewModel() {

            var allBeersList = mutableStateOf<List<BeerDomainModel>>(listOf())

    init {

    }


}