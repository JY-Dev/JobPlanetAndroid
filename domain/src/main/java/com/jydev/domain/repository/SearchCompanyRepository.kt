package com.jydev.domain.repository

import com.jydev.domain.model.SearchCompanyEntity
import io.reactivex.rxjava3.core.Single

interface SearchCompanyRepository {
    fun getSearchCompanyList() : Single<SearchCompanyEntity>
}