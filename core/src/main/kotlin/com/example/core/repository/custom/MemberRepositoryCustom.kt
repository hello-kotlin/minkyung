package com.example.core.repository.custom

import com.example.core.entity.Member
import org.springframework.data.domain.Page
import java.awt.print.Pageable
import javax.persistence.criteria.Predicate

interface MemberRepositoryCustom {
    fun fetch(vararg predicate: Predicate, pageable: Pageable): Page<Member>
}