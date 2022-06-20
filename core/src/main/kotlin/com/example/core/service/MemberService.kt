package com.example.core.service

import com.example.contract.dto.PageResult
import com.example.contract.dto.member.MemberCreation
import com.example.contract.dto.member.MemberList
import com.example.contract.dto.member.MemberSearch
import com.example.core.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MemberService(
    private val memberRepository: MemberRepository,
) {

    @Transactional
    fun register(memberCreation: MemberCreation) {
        memberRepository.save(memberCreation.toMember())
    }

    fun find(memberSearch: MemberSearch): PageResult<MemberList> {
        //        return memberRepository.fetch(memberSearch)
        return PageResult()
    }
}
