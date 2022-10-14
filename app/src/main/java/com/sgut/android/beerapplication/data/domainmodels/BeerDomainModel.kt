package com.sgut.android.beerapplication.data.domainmodels

import com.google.gson.annotations.SerializedName
import com.sgut.android.beerapplication.BoilVolume
import com.sgut.android.beerapplication.Ingredients
import com.sgut.android.beerapplication.Method
import com.sgut.android.beerapplication.Volume

data class BeerDomainModel(
    var id: Int? = null,
    var name: String? = null,
    var tagline: String? = null,
    var firstBrewed: String? = null,
    var description: String? = null,
    var imageUrl: String? = null,
    var abv: Double? = null,
    var ibu: Int? = null,
    var targetFg: Int? = null,
    var targetOg: Int? = null,
    var ebc: Int? = null,
    var srm: Int? = null,
    var ph: Double? = null,
    var attenuationLevel: Int? = null,
    var volume: Volume? = Volume(),
    var boilVolume: BoilVolume? = BoilVolume(),
    var method: Method? = Method(),
    var ingredients: Ingredients? = Ingredients(),
    var foodPairing: ArrayList<String> = arrayListOf(),
    var brewersTips: String? = null,
    var contributedBy: String? = null,


    )