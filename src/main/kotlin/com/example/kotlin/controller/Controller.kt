package com.example.kotlin.controller

import com.example.kotlin.dto.MemberDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class Controller {
    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }
    @GetMapping("/user")
    fun user(): ResponseEntity<Any>{
        val user = MemberDto("dahyeon","dahyeon@gmail.com","010-0000-0000")
        return ResponseEntity.ok(user)
    }
}