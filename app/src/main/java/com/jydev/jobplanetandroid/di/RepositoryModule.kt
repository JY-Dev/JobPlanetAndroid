package com.jydev.jobplanetandroid.di

import com.jydev.data.repository.SearchCompanyRepositoryImpl
import com.jydev.domain.repository.SearchCompanyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun bindSearchCompanyRepository(searchCompanyRepositoryImpl: SearchCompanyRepositoryImpl): SearchCompanyRepository
}