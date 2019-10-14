package com.waykichain.mqtt.push.repository

import com.waykichain.mqtt.push.entity.domain.UcMqttAcl

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QueryDslPredicateExecutor

interface UcMqttAclRepository : JpaRepository<UcMqttAcl, Long>,
    QueryDslPredicateExecutor<UcMqttAcl>
