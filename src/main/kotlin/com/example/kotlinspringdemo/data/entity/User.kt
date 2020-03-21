package com.example.kotlinspringdemo.data.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class User(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,

        val account: String,

        val password: String,

        val createTime: LocalDateTime,

        val updateTime: LocalDateTime
)