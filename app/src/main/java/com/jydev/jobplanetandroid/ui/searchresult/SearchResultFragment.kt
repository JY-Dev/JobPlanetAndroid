package com.jydev.jobplanetandroid.ui.searchresult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.bumptech.glide.RequestManager
import com.jydev.jobplanetandroid.R
import com.jydev.jobplanetandroid.databinding.FragmentSearchResultBinding
import com.jydev.jobplanetandroid.models.entity.search.CompanyCellTypeEntity
import com.jydev.jobplanetandroid.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SearchResultFragment :
    BaseFragment<FragmentSearchResultBinding>(R.layout.fragment_search_result) {
    private val viewModel: SearchResultViewModel by viewModels()
    private val gotoCompanyDetail: (CompanyCellTypeEntity) -> Unit = {
        SearchResultFragmentDirections.actionSearchResultFragmentToCompanyDetailFragment(it)
            .navigate()
    }
    @Inject
    lateinit var glide: RequestManager
    private val searchResultAdapter: SearchResultAdapter by lazy {
        SearchResultAdapter(glide, gotoCompanyDetail)
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchResultBinding {
        return FragmentSearchResultBinding.inflate(inflater, container, false)
    }

    override fun setUpView() {
        with(binding) {
            searchResultRecyclerView.adapter = searchResultAdapter
        }
        viewModel.getSearchCompanyList()
    }

    override fun observeView() {
        viewModel.searchList.observe(this, {
            searchResultAdapter.setItems(it)
        })
    }


}