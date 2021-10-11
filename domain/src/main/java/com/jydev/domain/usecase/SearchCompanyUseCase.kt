package com.jydev.domain.usecase

import com.jydev.domain.model.SearchCellTypeEntity
import com.jydev.domain.repository.SearchCompanyRepository
import io.reactivex.rxjava3.core.Scheduler
import javax.inject.Inject

class SearchCompanyUseCase @Inject constructor(private val repository: SearchCompanyRepository) {
    operator fun invoke(observeOn : Scheduler, subscribeOn : Scheduler , result : (SearchResult) -> Unit){
        repository.getSearchCompanyList()
            .observeOn(observeOn)
            .subscribeOn(subscribeOn)
            .subscribe({
                result(SearchResult.Success(it.items))
            },{
                it.printStackTrace()
                result(SearchResult.Error(it.message ?: "Error"))
            })
    }
    sealed class SearchResult{
        data class Error(val errorMessage : String) : SearchResult()
        data class Success(val searchCompanyEntity: List<SearchCellTypeEntity>) : SearchResult()
    }
}