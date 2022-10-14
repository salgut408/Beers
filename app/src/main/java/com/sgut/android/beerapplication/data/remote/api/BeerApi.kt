package com.sgut.android.beerapplication.data.remote.api

import com.sgut.android.beerapplication.BeerResponse
import retrofit2.Response
import retrofit2.http.GET

interface BeerApi {
    @GET("beers")
    suspend fun getAllBeers(): Response<List<BeerResponse>>
}