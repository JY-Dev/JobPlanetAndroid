package com.jydev.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CompanyCellTypeEntity(
    val companyId : Int,
    val ranking : Int,
    val logoPath : String,
    val companyName : String,
    val rateTotalAvg : String,
    val industryName : String,
    val reviewSummary : String,
    val salaryAvg : String,
    val interviewQuestion : String
) : Entity,Parcelable