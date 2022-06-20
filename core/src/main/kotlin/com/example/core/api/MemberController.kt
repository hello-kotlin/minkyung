package com.example.core.api

import com.example.contract.api.MemberContract
import com.example.contract.dto.member.MemberCreation
import com.example.contract.dto.member.MemberList
import com.example.contract.dto.PageResult
import com.example.contract.dto.member.MemberSearch
import com.example.core.service.MemberService
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
    private val memberService: MemberService
) : MemberContract {

    override fun create(memberCreation: MemberCreation) {
        memberService.register(memberCreation)
    }

    override fun search(memberSearch: MemberSearch): PageResult<MemberList> {
        return memberService.find(memberSearch)
    }

}