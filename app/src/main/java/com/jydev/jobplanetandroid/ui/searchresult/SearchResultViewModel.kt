package com.jydev.jobplanetandroid.ui.searchresult

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jydev.jobplanetandroid.data.repository.SearchCompanyRepository
import com.jydev.jobplanetandroid.models.entity.search.SearchCellTypeEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class SearchResultViewModel @Inject constructor(private val repository: SearchCompanyRepository) :
    ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private var _searchList = MutableLiveData<List<SearchCellTypeEntity>>()
    val searchList: LiveData<List<SearchCellTypeEntity>>
        get() = _searchList

    fun getSearchCompanyList() {
        repository.getSearchCompanyList().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _searchList.value = it.items
            }, {
                it.printStackTrace()
            }).addToComposite()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    private fun Disposable.addToComposite() {
        compositeDisposable.add(this)
    }
}