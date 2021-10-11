package com.jydev.jobplanetandroid.ui.searchresult

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jydev.domain.usecase.SearchCompanyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class SearchResultViewModel @Inject constructor(private val searchCompanyUseCase: SearchCompanyUseCase) :
    ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private var _searchResult = MutableLiveData<SearchCompanyUseCase.SearchResult>()
    val searchResult: LiveData<SearchCompanyUseCase.SearchResult>
        get() = _searchResult

    fun getSearchCompanyList() {
        searchCompanyUseCase(AndroidSchedulers.mainThread(),Schedulers.io()){
            _searchResult.value = it
        }
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    private fun Disposable.addToComposite() {
        compositeDisposable.add(this)
    }

}