package com.waykichain.mqtt.push.repository

import com.waykichain.mqtt.push.entity.domain.UcSysRequestLog

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QueryDslPredicateExecutor

interface UcSysRequestLogRepository : JpaRepository<UcSysRequestLog, Long>,
    QueryDslPredicateExecutor<UcSysRequestLog>
