package com.example.contract.dto.member

import com.example.contract.dto.PageParam
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "회원 검색 조건 모델")
data class MemberSearch(
    val name: String?,
    val email: String?,
) : PageParam()
