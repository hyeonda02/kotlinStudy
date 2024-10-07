package com.example.kotlin.service

import com.example.kotlin.domain.Member
import com.example.kotlin.dto.MemberDto
import java.util.*

interface MemberService {
    fun findMember(name: String): Optional<Member>
    fun save(memberDto: MemberDto)
}