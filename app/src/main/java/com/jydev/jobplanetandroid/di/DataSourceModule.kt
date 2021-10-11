package com.jydev.jobplanetandroid.di

import com.jydev.data.datasource.SearchCompanyDataSource
import com.jydev.data.datasource.SearchCompanyDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    fun bindSearchCompanyDataSource(searchCompanyDataSourceImpl: SearchCompanyDataSourceImpl): SearchCompanyDataSource
}