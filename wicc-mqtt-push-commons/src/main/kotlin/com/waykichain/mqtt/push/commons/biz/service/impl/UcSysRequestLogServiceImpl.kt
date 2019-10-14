package com.waykichain.mqtt.push.commons.biz.service.impl

import com.waykichain.mqtt.push.commons.biz.service.UcSysRequestLogService
import com.waykichain.mqtt.push.entity.domain.UcSysRequestLog
import com.waykichain.mqtt.push.repository.UcSysRequestLogRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class UcSysRequestLogServiceImpl: UcSysRequestLogService {

    override fun getById(id:Long): UcSysRequestLog? {
        return ucSysRequestLogRepository.findOne(id)
    }

    override fun save(ucSysRequestLog: UcSysRequestLog): UcSysRequestLog {
        return ucSysRequestLogRepository.saveAndFlush(ucSysRequestLog)
    }

    @Autowired lateinit var ucSysRequestLogRepository: UcSysRequestLogRepository
}
