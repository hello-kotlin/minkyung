package com.example.core.service

import com.example.contract.dto.member.MemberCreation
import com.example.core.entity.Member

fun MemberCreation.toMember(): Member {
    return Member(
        id = 0,
        password = password,
        name = name,
        email = email
    )
}
