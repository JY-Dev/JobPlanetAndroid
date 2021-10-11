package com.jydev.data.datasource

import com.jydev.data.model.response.SearchCompanyResponse
import com.jydev.data.service.JobPlanetService
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class SearchCompanyDataSourceImpl @Inject constructor(private val service: JobPlanetService) :
    SearchCompanyDataSource {
    override fun getSearchCompanyList(): Single<SearchCompanyResponse> {
        return service.getSearchCompanyList()
    }
}