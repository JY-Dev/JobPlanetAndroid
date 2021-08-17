package com.jydev.jobplanetandroid.models.entity.search

import com.jydev.jobplanetandroid.models.entity.Entity

data class HorizontalThemeCellTypeEntity(val totalSize : Int, val themes : List<ThemeEntity>) :
    Entity
data class ThemeEntity(val id : Int,val color : String, val coverImageUrl : String , val title : String)