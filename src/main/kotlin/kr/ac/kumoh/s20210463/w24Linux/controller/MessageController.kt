package kr.ac.kumoh.s20210463.w24Linux.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message")
class MessageController {
    @GetMapping
    // TODO: React 주소 변경할 것
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getMessage() = mapOf("status" to "success")
}