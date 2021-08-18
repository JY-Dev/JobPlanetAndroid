package com.jydev.jobplanetandroid.ui.searchresult.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jydev.jobplanetandroid.databinding.ItemCompanyBinding
import com.jydev.jobplanetandroid.models.entity.search.ReviewCellTypeEntity
import com.jydev.jobplanetandroid.ui.BaseViewHolder

class CompanyReviewViewHolder(private val view: ItemCompanyBinding) : BaseViewHolder<ReviewCellTypeEntity>(view.root) {
    override fun bind(item: ReviewCellTypeEntity) {
        with(view){

        }
    }

    companion object {
        fun create(
            parent: ViewGroup
        ): CompanyReviewViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemCompanyBinding.inflate(layoutInflater, parent, false)
            return CompanyReviewViewHolder(binding)
        }
    }
}