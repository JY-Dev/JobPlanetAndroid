package com.jydev.data.datasource

import com.jydev.data.model.response.SearchCompanyResponse
import io.reactivex.rxjava3.core.Single

interface SearchCompanyDataSource {
    fun getSearchCompanyList() : Single<SearchCompanyResponse>
}