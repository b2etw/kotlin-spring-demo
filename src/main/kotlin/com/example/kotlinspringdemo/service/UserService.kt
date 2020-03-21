package com.example.kotlinspringdemo.service

import com.example.kotlinspringdemo.data.dto.request.UserRequest
import com.example.kotlinspringdemo.data.entity.User

interface UserService {

    fun findByAccount(account: String): User?

    fun save(userRequest: UserRequest): User
}