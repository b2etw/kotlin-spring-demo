package com.example.kotlinspringdemo.service.impl

import com.example.kotlinspringdemo.data.dto.request.UserRequest
import com.example.kotlinspringdemo.data.entity.User
import com.example.kotlinspringdemo.repository.UserRepository
import com.example.kotlinspringdemo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class UserServiceImpl(
        @Autowired val userRepository: UserRepository
) : UserService {

    override fun findByAccount(account: String) = userRepository.findByAccount(account)

    override fun save(userRequest: UserRequest) = userRepository.save(User(null, userRequest.account, userRequest.password, LocalDateTime.now(), LocalDateTime.now()))
}