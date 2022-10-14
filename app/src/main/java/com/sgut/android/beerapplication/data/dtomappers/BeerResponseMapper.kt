package com.sgut.android.beerapplication.data.dtomappers

import com.sgut.android.beerapplication.BeerResponse
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel

class BeerResponseMapper : DomainMapper<BeerResponse, BeerDomainModel> {
    override fun mapToDomainModel(model: BeerResponse): BeerDomainModel {
        return BeerDomainModel(
            abv = model.abv,
            brewersTips = model.brewersTips,
            contributedBy = model.contributedBy,
            description = model.description,
            firstBrewed = model.firstBrewed,
            foodPairing = model.foodPairing,
            ibu = model.ibu?.toDouble(),
            imageUrl = model.imageUrl,
            ingredients = model.ingredients,
            name = model.name,

            tagline = model.tagline,

        )
    }
    fun toDomainList(initial: List<BeerResponse>): List<BeerDomainModel> {
        return initial.map { mapToDomainModel(it) }
    }
}