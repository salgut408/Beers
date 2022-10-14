package com.sgut.android.beerapplication.listscreen

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel
import com.sgut.android.beerapplication.repository.BeerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BeerViewModel @Inject constructor (
    private  val beerRepository: BeerRepository
        ): ViewModel() {

            var allBeersList = mutableStateOf<List<BeerDomainModel>>(listOf())

    init {
        loadAllBeersList()
    }

    fun loadAllBeersList() = viewModelScope.launch {
        try {
            val result = beerRepository.getBeer()
            allBeersList.value = result
        } catch (e: Exception) {
            Log.i("tag",e.message.toString())
        }
    }


}