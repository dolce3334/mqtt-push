package com.waykichain.mqtt.push.commons.biz.service

import com.waykichain.mqtt.push.entity.domain.UcSysRequestLog

interface UcSysRequestLogService {
    fun getById(id:Long): UcSysRequestLog?

    fun save(ucSysRequestLog: UcSysRequestLog): UcSysRequestLog
}
