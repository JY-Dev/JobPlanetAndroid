package com.jydev.jobplanetandroid.models

import com.jydev.jobplanetandroid.models.dto.search.CompanyCellTypeDTO
import com.jydev.jobplanetandroid.models.dto.search.HorizontalThemeCellTypeDTO
import com.jydev.jobplanetandroid.models.dto.search.ReviewCellTypeDTO

sealed class SearchCellType {
    data class Company(val data: CompanyCellTypeDTO) : SearchCellType()
    data class HorizontalTheme(val data: HorizontalThemeCellTypeDTO) : SearchCellType()
    data class Review(val data: ReviewCellTypeDTO) : SearchCellType()
    object None : SearchCellType()

    companion object {
        const val CELL_TYPE_COMPANY = "CELL_TYPE_COMPANY"
        const val CELL_TYPE_HORIZONTAL_THEME = "CELL_TYPE_HORIZONTAL_THEME"
        const val CELL_TYPE_REVIEW = "CELL_TYPE_REVIEW"
    }
}
