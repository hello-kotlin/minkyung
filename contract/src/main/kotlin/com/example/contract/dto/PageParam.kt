package com.example.contract.dto

open class PageParam(
    protected open val defaultSort: String = ""
) {
    var page = 0
    open var size = 10

    open var sort = ""
        get() = field.ifEmpty { defaultSort }
}
