package com.sgut.android.beerapplication.repository

import com.sgut.android.beerapplication.data.db.BeerDatabase
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel
import com.sgut.android.beerapplication.data.dtomappers.BeerResponseMapper
import com.sgut.android.beerapplication.data.remote.api.BeerApi
import javax.inject.Inject

class BeerRepository @Inject constructor(
    val beerResponseMapper: BeerResponseMapper,
    val beerApi: BeerApi,

) {
    suspend fun getBeer(): List<BeerDomainModel> {
        var result = beerApi.getAllBeers().body()
        return beerResponseMapper.toDomainList(result!!)
    }
}