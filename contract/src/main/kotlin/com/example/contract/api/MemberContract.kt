package com.example.contract.api

import com.example.contract.dto.member.MemberCreation
import com.example.contract.dto.member.MemberList
import com.example.contract.dto.PageResult
import com.example.contract.dto.member.MemberSearch
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Tag(name = "MemberContract", description = "회원 API")
interface MemberContract {
    @PostMapping("/members")
    fun create(@RequestBody memberCreation: MemberCreation)

    @GetMapping("/members")
    fun search(memberSearch: MemberSearch): PageResult<MemberList>

//    @GetMapping("/members/{memberId}")
//    fun findOne(@PathVariable memberId: Long): MemberDetail
//
//    @PutMapping("/members/{memberId}")
//    fun update(
//        @PathVariable memberId: Long,
//        @RequestBody memberModification: MemberModification
//    ): MemberDetail
//
//    @DeleteMapping("/members/{memberId}")
//    fun delete(@PathVariable memberId: Long): MemberDetail
}
