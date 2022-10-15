package com.sgut.android.beerapplication.di

import com.sgut.android.beerapplication.data.db.BeerDatabase
import com.sgut.android.beerapplication.data.dtomappers.BeerResponseMapper
import com.sgut.android.beerapplication.data.remote.api.BeerApi
import com.sgut.android.beerapplication.repository.BeerRepository
import com.sgut.android.beerapplication.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBeerRepository(
        beerApi: BeerApi,
        beerResponseMapper: BeerResponseMapper,
    ) : BeerRepository = BeerRepository(beerResponseMapper, beerApi)

    @Provides
    fun provideBeerResponseMapper(): BeerResponseMapper = BeerResponseMapper()

    @Singleton
    @Provides
    fun provideOkhttpClient(): OkHttpClient =
        OkHttpClient.Builder().build()

    @Singleton
    @Provides
    fun provideBeerApi(okHttpClient: OkHttpClient): BeerApi =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BeerApi::class.java)

}