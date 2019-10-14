package com.waykichain.mqtt.push.commons.biz.service.impl

import com.waykichain.mqtt.push.commons.biz.service.UcMqttAclService
import com.waykichain.mqtt.push.entity.domain.UcMqttAcl
import com.waykichain.mqtt.push.repository.UcMqttAclRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class UcMqttAclServiceImpl: UcMqttAclService {

    override fun getById(id:Long): UcMqttAcl? {
        return ucMqttAclRepository.findOne(id)
    }

    override fun save(ucMqttAcl: UcMqttAcl): UcMqttAcl {
        return ucMqttAclRepository.saveAndFlush(ucMqttAcl)
    }

    @Autowired lateinit var ucMqttAclRepository: UcMqttAclRepository
}
