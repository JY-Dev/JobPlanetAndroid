package com.jydev.jobplanetandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jydev.jobplanetandroid.R
import com.jydev.jobplanetandroid.databinding.FragmentCompanyDetailBinding


class CompanyDetailFragment : BaseFragment<FragmentCompanyDetailBinding>(R.layout.fragment_company_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentCompanyDetailBinding {
        return FragmentCompanyDetailBinding.inflate(inflater,container,false)
    }

    override fun setUpView() {
        TODO("Not yet implemented")
    }

    override fun observeView() {
        TODO("Not yet implemented")
    }

}