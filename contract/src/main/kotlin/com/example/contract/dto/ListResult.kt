package com.example.contract.dto

open class ListResult<T>(initList: Iterable<T>? = null) {
    private val items = mutableListOf<T>()

    init {
        if (initList != null) items.addAll(initList)
    }

    fun addAll(others: Iterable<T>) = apply { items.addAll(others) }
}
