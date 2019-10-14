package com.waykichain.mqtt.push.repository

import com.waykichain.mqtt.push.entity.domain.UcMqttUser

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QueryDslPredicateExecutor

interface UcMqttUserRepository : JpaRepository<UcMqttUser, Long>,
    QueryDslPredicateExecutor<UcMqttUser>
