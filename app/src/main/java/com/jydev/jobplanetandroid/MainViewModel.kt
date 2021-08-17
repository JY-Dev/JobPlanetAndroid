package com.jydev.jobplanetandroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jydev.jobplanetandroid.data.datasource.SearchCompanyDataSource
import com.jydev.jobplanetandroid.models.dto.search.SearchCellTypeDTO
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val dataSource: SearchCompanyDataSource) : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private var _searchList = MutableLiveData<List<SearchCellTypeDTO>>()
    val searchList : LiveData<List<SearchCellTypeDTO>>
        get() = _searchList
    fun getSearchCompanyList(){
        dataSource.getSearchCompanyList().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _searchList.value = it.items
            },{
                it.printStackTrace()
            }).addToComposite()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    private fun Disposable.addToComposite(){
        compositeDisposable.add(this)
    }
}