package com.jydev.domain.model
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

sealed class SearchCellTypeEntity {
    data class Company(val data: CompanyCellTypeEntity) : SearchCellTypeEntity()
    data class HorizontalTheme(val data: HorizontalThemeCellTypeEntity) : SearchCellTypeEntity()
    data class Review(val data: ReviewCellTypeEntity) : SearchCellTypeEntity()
    object None : SearchCellTypeEntity()
}

data class ReviewCellTypeEntity(
    val companyId : Int,
    val industryId : Int,
    val ranking : Int,
    val logoPath : String,
    val companyName : String,
    val industryName : String,
    val rateTotalAvg : String,
    val reviewSummary : String,
    val pros : String,
    val cons : String
) : Entity

data class HorizontalThemeCellTypeEntity(val totalSize : Int, val themes : List<ThemeEntity>) :
    Entity

@Parcelize
data class ThemeEntity(val id : Int,val color : String, val coverImageUrl : String , val title : String) : Parcelable