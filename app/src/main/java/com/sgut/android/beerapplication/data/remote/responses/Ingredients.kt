package com.sgut.android.beerapplication

import com.google.gson.annotations.SerializedName


data class Ingredients (

  @SerializedName("malt"  ) var malt  : ArrayList<Malt> = arrayListOf(),
  @SerializedName("hops"  ) var hops  : ArrayList<Hops> = arrayListOf(),
  @SerializedName("yeast" ) var yeast : String?         = null

)