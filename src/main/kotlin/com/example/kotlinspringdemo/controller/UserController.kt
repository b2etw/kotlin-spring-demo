package com.example.kotlinspringdemo.controller

import com.example.kotlinspringdemo.data.dto.request.UserRequest
import com.example.kotlinspringdemo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
        @Autowired val userService: UserService
) {

    @GetMapping("/v1/user")
    fun queryUserV1(@RequestParam account: String) = userService.findByAccount(account)

    @PostMapping("/v1/user")
    fun addUserV1(@RequestBody userRequest: UserRequest) = userService.save(userRequest)
}