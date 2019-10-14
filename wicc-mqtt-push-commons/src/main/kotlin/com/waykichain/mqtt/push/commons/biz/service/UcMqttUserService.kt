package com.waykichain.mqtt.push.commons.biz.service

import com.waykichain.mqtt.push.entity.domain.UcMqttUser

interface UcMqttUserService {
    fun getById(id:Long): UcMqttUser?

    fun save(ucMqttUser: UcMqttUser): UcMqttUser
}
