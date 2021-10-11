package com.jydev.data.repository

import com.jydev.data.datasource.SearchCompanyDataSource
import com.jydev.data.model.dto.search.SearchCellTypeDTO.Companion.toEntity
import com.jydev.domain.model.SearchCompanyEntity
import com.jydev.domain.repository.SearchCompanyRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class SearchCompanyRepositoryImpl @Inject constructor(private val dataSource: SearchCompanyDataSource) :
    SearchCompanyRepository {
    override fun getSearchCompanyList(): Single<SearchCompanyEntity> {
        return dataSource.getSearchCompanyList().map {
            SearchCompanyEntity(it.minimumInterviews,it.totalPage,it.minimumReviews,it.totalCount,it.items.map { DTO ->
                DTO.toEntity()
            })
        }
    }
}