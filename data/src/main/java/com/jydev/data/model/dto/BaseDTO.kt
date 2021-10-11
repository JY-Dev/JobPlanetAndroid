package com.jydev.data.model.dto

import com.jydev.domain.model.Entity

interface BaseDTO<T : Entity> {
    fun toEntity() : T
}