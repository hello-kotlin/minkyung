package com.example.contract.dto.member

import java.time.LocalDateTime

data class MemberList(
    val id: Long,
    val name: String,
    val email: String,
    val updatedAt: LocalDateTime,
    val createdAt: LocalDateTime,
)
