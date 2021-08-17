package com.jydev.jobplanetandroid.models.dto.search

import com.jydev.jobplanetandroid.models.entity.search.SearchCellTypeEntity

sealed class SearchCellTypeDTO {
    data class Company(val data: CompanyCellTypeDTO) : SearchCellTypeDTO()
    data class HorizontalTheme(val data: HorizontalThemeCellTypeDTO) : SearchCellTypeDTO()
    data class Review(val data: ReviewCellTypeDTO) : SearchCellTypeDTO()
    fun getEntity(searchCellTypeDTO : SearchCellTypeDTO) : SearchCellTypeEntity{
        return when(searchCellTypeDTO){
            is Company -> SearchCellTypeEntity.Company(searchCellTypeDTO.data.getEntity())
            is HorizontalTheme -> SearchCellTypeEntity.HorizontalTheme(searchCellTypeDTO.data.getEntity())
            is Review -> SearchCellTypeEntity.Review(searchCellTypeDTO.data.getEntity())
            else -> SearchCellTypeEntity.None
        }
    }
    object None : SearchCellTypeDTO()

    companion object {
        const val CELL_TYPE_COMPANY = "CELL_TYPE_COMPANY"
        const val CELL_TYPE_HORIZONTAL_THEME = "CELL_TYPE_HORIZONTAL_THEME"
        const val CELL_TYPE_REVIEW = "CELL_TYPE_REVIEW"
    }
}
