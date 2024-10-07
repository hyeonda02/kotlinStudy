package com.example.kotlin.repository

import com.example.kotlin.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface MemberRepository: JpaRepository<Member,Long> {
    fun findByName(name: String): Optional<Member>
}