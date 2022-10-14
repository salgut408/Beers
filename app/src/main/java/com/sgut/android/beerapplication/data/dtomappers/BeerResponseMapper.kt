package com.sgut.android.beerapplication.data.dtomappers

import com.sgut.android.beerapplication.BeerResponse
import com.sgut.android.beerapplication.data.domainmodels.BeerDomainModel

class BeerResponseMapper : DomainMapper<BeerResponse, BeerDomainModel> {
    override fun mapToDomainModel(model: BeerResponse): BeerDomainModel {
        return BeerDomainModel(
            abv = model.abv,
            attenuationLevel = model.attenuationLevel,
            boilVolume = model.boilVolume,
            brewersTips = model.brewersTips,
            contributedBy = model.contributedBy,
            description = model.description,
            ebc = model.ebc,
            firstBrewed = model.firstBrewed,
            foodPairing = model.foodPairing,
            ibu = model.ibu,
            imageUrl = model.imageUrl,
            ingredients = model.ingredients,
            method = model.method,
            name = model.name,
            ph = model.ph,
            srm = model.srm,
            tagline = model.tagline,
            targetFg = model.targetFg,
            targetOg = model.targetOg,
            volume = model.volume
        )
    }
    fun toDomainList(initial: List<BeerResponse>): List<BeerDomainModel> {
        return initial.map { mapToDomainModel(it) }
    }
}