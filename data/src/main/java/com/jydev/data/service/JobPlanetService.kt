package com.jydev.data.service

import com.jydev.data.model.response.SearchCompanyResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface JobPlanetService {
    @GET("mobile-config/test_data.json")
    fun getSearchCompanyList() : Single<SearchCompanyResponse>
}