package kr.ac.kumoh.s20210463.w24Linux.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class MessageController {
    @GetMapping
    fun getRoot() = mapOf("status" to "success")

    @RequestMapping("/api/message")
    // TODO: React 주소 변경할 것
    @CrossOrigin(origins = ["https://wsp2024s20210463linux.netlify.app"])
    fun getMessage() = mapOf("status" to "success")
}