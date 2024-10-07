package com.example.kotlin.domain

import jakarta.persistence.*

@Entity
@Table(name="MEMBER")
class Member(
        var name: String,
        val email: String,
        val phone: String?=null,
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    fun changeName(name: String) {
        this.name = name

    }

}