package com.jydev.jobplanetandroid.di

import com.jydev.data.datasource.SearchCompanyDataSourceImpl
import com.jydev.domain.repository.SearchCompanyRepository
import com.jydev.domain.usecase.SearchCompanyUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Singleton
    @Provides
    fun provideSearchCompanyUseCase(searchCompanyRepository: SearchCompanyRepository) : SearchCompanyUseCase{
        return SearchCompanyUseCase(searchCompanyRepository)
    }

}