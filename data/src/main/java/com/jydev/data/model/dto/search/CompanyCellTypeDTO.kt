package com.jydev.data.model.dto.search

import com.google.gson.annotations.SerializedName
import com.jydev.data.model.dto.BaseDTO
import com.jydev.domain.model.CompanyCellTypeEntity
import com.jydev.util.addQuotationMarks
import com.jydev.util.getCommaDecimal

data class CompanyCellTypeDTO(
    val ranking: Int,
    @SerializedName("cell_type")
    val cellType: String,
    @SerializedName("interview_difficulty")
    val interviewDifficulty: Double,
    val name: String,
    @SerializedName("salary_avg")
    val salaryAvg: Int,
    @SerializedName("web_site")
    val webSite: String,
    @SerializedName("logo_path")
    val logoPath: String,
    @SerializedName("interview_question")
    val interviewQuestion: String,
    @SerializedName("company_id")
    val companyId: Int,
    @SerializedName("has_job_posting")
    val hasJobPosting: Boolean,
    @SerializedName("rate_total_avg")
    val rateTotalAvg: Double,
    @SerializedName("industry_id")
    val industryId: Int,
    @SerializedName("review_summary")
    val reviewSummary: String,
    val type: String,
    @SerializedName("industry_name")
    val industryName: String,
    @SerializedName("simple_desc")
    val simpleDesc: String

) : BaseDTO<CompanyCellTypeEntity> {
    override fun toEntity(): CompanyCellTypeEntity {
        return CompanyCellTypeEntity(
            companyId,
            ranking,
            logoPath,
            name,
            rateTotalAvg.toString(),
            industryName,
            reviewSummary.addQuotationMarks(),
            salaryAvg.getCommaDecimal(),
            interviewQuestion
        )
    }

}