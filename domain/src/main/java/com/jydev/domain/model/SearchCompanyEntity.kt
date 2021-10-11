package com.jydev.domain.model

data class SearchCompanyEntity(val minimumInterviews : Int,
                               val totalPage : Int,
                               val minimumReviews : Int,
                               val totalCount : Int,
                               val items : List<SearchCellTypeEntity>): Entity