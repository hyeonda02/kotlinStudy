package com.example.kotlin.controller

import com.example.kotlin.domain.Member
import com.example.kotlin.dto.MemberDto
import com.example.kotlin.service.MemberService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController(
        private val memberService: MemberService,
) {
    @GetMapping("/{name}")
    fun getMember(@PathVariable(value = "name")name : String):ResponseEntity<Member>{
        return ResponseEntity.ok(memberService.findMember(name).get())
    }

    @PostMapping("")
    fun saveMember(@RequestBody memberDto : MemberDto): ResponseEntity<Any>{
        memberService.save(memberDto)
        return ResponseEntity.status(HttpStatus.CREATED).body("회원가입완료")
    }

}