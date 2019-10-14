package com.waykichain.mqtt.push.repository

import com.waykichain.mqtt.push.entity.domain.UcSysConfig

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QueryDslPredicateExecutor

interface UcSysConfigRepository : JpaRepository<UcSysConfig, Long>,
    QueryDslPredicateExecutor<UcSysConfig>
