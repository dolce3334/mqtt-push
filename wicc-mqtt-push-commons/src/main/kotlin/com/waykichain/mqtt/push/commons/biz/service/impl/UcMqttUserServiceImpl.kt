package com.waykichain.mqtt.push.commons.biz.service.impl

import com.waykichain.mqtt.push.commons.biz.service.UcMqttUserService
import com.waykichain.mqtt.push.entity.domain.UcMqttUser
import com.waykichain.mqtt.push.repository.UcMqttUserRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class UcMqttUserServiceImpl: UcMqttUserService {

    override fun getById(id:Long): UcMqttUser? {
        return ucMqttUserRepository.findOne(id)
    }

    override fun save(ucMqttUser: UcMqttUser): UcMqttUser {
        return ucMqttUserRepository.saveAndFlush(ucMqttUser)
    }

    @Autowired lateinit var ucMqttUserRepository: UcMqttUserRepository
}
