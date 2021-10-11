package com.jydev.data.model.dto.search

import com.google.gson.annotations.SerializedName
import com.jydev.data.model.dto.BaseDTO
import com.jydev.domain.model.HorizontalThemeCellTypeEntity
import com.jydev.domain.model.ThemeEntity

data class HorizontalThemeCellTypeDTO(
    val count: Int,
    val themes: List<ThemeDTO>,
    @SerializedName("cell_type") val cellType: String
) : BaseDTO<HorizontalThemeCellTypeEntity> {
    override fun toEntity(): HorizontalThemeCellTypeEntity {
        return HorizontalThemeCellTypeEntity(count,themes.map{
            ThemeEntity(it.id,it.color,it.coverImage,it.title)
        })
    }

}

data class ThemeDTO(
    val color: String,
    @SerializedName("cover_image")
    val coverImage: String,
    val id: Int,
    val title: String
)