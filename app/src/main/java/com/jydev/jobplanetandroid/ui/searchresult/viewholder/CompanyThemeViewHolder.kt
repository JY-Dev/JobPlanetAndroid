package com.jydev.jobplanetandroid.ui.searchresult.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jydev.jobplanetandroid.databinding.ItemCompanyThemeBinding
import com.jydev.jobplanetandroid.models.entity.search.HorizontalThemeCellTypeEntity
import com.jydev.jobplanetandroid.ui.BaseViewHolder

class CompanyThemeViewHolder(private val view : ItemCompanyThemeBinding) : BaseViewHolder<HorizontalThemeCellTypeEntity>(view.root) {
    override fun bind(item: HorizontalThemeCellTypeEntity) {
        with(view){

        }
    }
    companion object {
        fun create(
            parent: ViewGroup
        ): CompanyThemeViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemCompanyThemeBinding.inflate(layoutInflater, parent, false)
            return CompanyThemeViewHolder(binding)
        }
    }
}