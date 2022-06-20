package com.example.core.repository.custom

import com.example.core.entity.Member
import org.springframework.data.domain.Page
import java.awt.print.Pageable
import javax.persistence.EntityManager
import javax.persistence.criteria.Predicate

class MemberRepositoryImpl(
    em: EntityManager
) : MemberRepositoryCustom {

    override fun fetch(vararg predicate: Predicate, pageable: Pageable): Page<Member> {
        TODO("implement")
    }
}
