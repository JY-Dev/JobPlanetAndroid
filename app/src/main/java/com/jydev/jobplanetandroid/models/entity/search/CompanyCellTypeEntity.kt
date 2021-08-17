package com.jydev.jobplanetandroid.models.entity.search

import com.jydev.jobplanetandroid.models.entity.Entity

data class CompanyCellTypeEntity(
    val companyId : Int,
    val ranking : Int,
    val logoPath : String,
    val companyName : String,
    val rateTotalAvg : Double,
    val industryName : String,
    val reviewSummary : String,
    val salaryAvg : String,
    val interviewQuestion : String
) : Entity