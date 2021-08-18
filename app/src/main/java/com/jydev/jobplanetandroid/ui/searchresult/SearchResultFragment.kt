package com.jydev.jobplanetandroid.ui.searchresult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.jydev.jobplanetandroid.R
import com.jydev.jobplanetandroid.databinding.FragmentSearchResultBinding
import com.jydev.jobplanetandroid.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchResultFragment : BaseFragment<FragmentSearchResultBinding>(R.layout.fragment_search_result) {
    private val viewModel : SearchResultViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){

        }
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchResultBinding {
       return FragmentSearchResultBinding.inflate(inflater,container,false)
    }

    override fun setUpView() {
        viewModel.getSearchCompanyList()
    }

    override fun observeView() {
        viewModel.searchList.observe(this,{

        })
    }


}