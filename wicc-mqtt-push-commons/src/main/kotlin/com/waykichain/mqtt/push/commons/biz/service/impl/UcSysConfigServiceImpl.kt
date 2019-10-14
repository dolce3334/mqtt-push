package com.waykichain.mqtt.push.commons.biz.service.impl

import com.waykichain.mqtt.push.commons.biz.service.UcSysConfigService
import com.waykichain.mqtt.push.entity.domain.UcSysConfig
import com.waykichain.mqtt.push.repository.UcSysConfigRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class UcSysConfigServiceImpl: UcSysConfigService {

    override fun getById(id:Long): UcSysConfig? {
        return ucSysConfigRepository.findOne(id)
    }

    override fun save(ucSysConfig: UcSysConfig): UcSysConfig {
        return ucSysConfigRepository.saveAndFlush(ucSysConfig)
    }

    @Autowired lateinit var ucSysConfigRepository: UcSysConfigRepository
}
