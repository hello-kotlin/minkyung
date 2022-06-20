package com.example.contract.dto

import java.io.Serializable

open class PageResult<T>() : ListResult<T>(), Serializable {
    var size: Int = 0
    var page: Int = 0
    var hasNext: Boolean = false
    var total: Long = 0

    constructor(
        initList: Iterable<T>? = null,
        size: Int = 0,
        page: Int = 0,
        hasNext: Boolean = false,
        total: Long = 0L
    ) : this() {
        if (initList != null) addAll(initList)
        this.size = size
        this.page = page
        this.hasNext = hasNext
        this.total = total
    }
}
