package com.jydev.jobplanetandroid.ui.searchresult.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jydev.jobplanetandroid.databinding.ItemCompanyBinding
import com.jydev.jobplanetandroid.models.entity.search.CompanyCellTypeEntity
import com.jydev.jobplanetandroid.ui.BaseViewHolder

class CompanyViewHolder(
    private val view: ItemCompanyBinding,
    val gotoCompanyDetail: (CompanyCellTypeEntity) -> Unit
) : BaseViewHolder<CompanyCellTypeEntity>(view.root) {

    override fun bind(item: CompanyCellTypeEntity) {
        with(view) {

        }
    }

    companion object {
        fun create(
            parent: ViewGroup,
            gotoCompanyDetail: (CompanyCellTypeEntity) -> Unit
        ): CompanyViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemCompanyBinding.inflate(layoutInflater, parent, false)
            return CompanyViewHolder(binding, gotoCompanyDetail)
        }
    }

}