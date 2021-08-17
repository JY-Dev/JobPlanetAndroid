package com.jydev.jobplanetandroid.models.dto.search

sealed class SearchCellTypeDTO {
    data class Company(val data: CompanyCellTypeDTO) : SearchCellTypeDTO()
    data class HorizontalTheme(val data: HorizontalThemeCellTypeDTO) : SearchCellTypeDTO()
    data class Review(val data: ReviewCellTypeDTO) : SearchCellTypeDTO()
    object None : SearchCellTypeDTO()

    companion object {
        const val CELL_TYPE_COMPANY = "CELL_TYPE_COMPANY"
        const val CELL_TYPE_HORIZONTAL_THEME = "CELL_TYPE_HORIZONTAL_THEME"
        const val CELL_TYPE_REVIEW = "CELL_TYPE_REVIEW"
    }
}
