package com.jydev.util

fun String.addQuotationMarks() : String{
    return if(this.isNotEmpty()) "\"$this\"" else ""
}