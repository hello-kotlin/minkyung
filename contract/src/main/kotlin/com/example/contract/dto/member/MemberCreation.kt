package com.example.contract.dto.member

data class MemberCreation(
    val password: String,
    val name: String,
    val email: String?,
)
