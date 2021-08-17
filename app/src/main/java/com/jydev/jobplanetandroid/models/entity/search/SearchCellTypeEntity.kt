package com.jydev.jobplanetandroid.models.entity.search

import com.jydev.jobplanetandroid.models.dto.search.CompanyCellTypeDTO
import com.jydev.jobplanetandroid.models.dto.search.HorizontalThemeCellTypeDTO
import com.jydev.jobplanetandroid.models.dto.search.ReviewCellTypeDTO
import com.jydev.jobplanetandroid.models.dto.search.SearchCellTypeDTO

sealed class SearchCellTypeEntity {
    data class Company(val data: CompanyCellTypeEntity) : SearchCellTypeEntity()
    data class HorizontalTheme(val data: HorizontalThemeCellTypeEntity) : SearchCellTypeEntity()
    data class Review(val data: ReviewCellTypeEntity) : SearchCellTypeEntity()
    object None : SearchCellTypeEntity()
}