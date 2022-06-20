package com.example.core.entity

import org.hibernate.Hibernate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
open class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    val id: Long = 0L,
    password: String,
    name: String,
    email: String?,
) : BaseEntity() {

    var password: String = password
        protected set

    var name: String = name
        protected set

    var email: String? = email
        protected set

    fun updateProfile(name: String) {
        this.name = name
    }

    fun updatePassword(password: String) {
        this.password = password
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Member

        return id != 0L && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    override fun toString(): String {
        return "Member(id=$id, password='$password' name='$name', email='$email')"
    }
}
