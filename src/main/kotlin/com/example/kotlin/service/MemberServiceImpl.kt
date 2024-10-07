package com.example.kotlin.service

import com.example.kotlin.domain.Member
import com.example.kotlin.dto.MemberDto
import com.example.kotlin.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional(readOnly = true)
class MemberServiceImpl(
        private val memberRepository: MemberRepository,
):MemberService {
    override fun findMember(name: String): Optional<Member> {
        return memberRepository.findByName(name)
    }
    @Transactional
    override fun save(memberDto: MemberDto) {
        memberRepository.save(Member(memberDto.name, memberDto.email, memberDto.phone))
    }
}