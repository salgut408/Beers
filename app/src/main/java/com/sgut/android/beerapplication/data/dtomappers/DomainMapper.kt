package com.sgut.android.beerapplication.data.dtomappers

interface DomainMapper<T, DomainModel> {
    fun mapToDomainModel(model: T): DomainModel
}