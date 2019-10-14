package com.waykichain.mqtt.push.commons.biz.service

import com.waykichain.mqtt.push.entity.domain.UcMqttAcl

interface UcMqttAclService {
    fun getById(id:Long): UcMqttAcl?

    fun save(ucMqttAcl: UcMqttAcl): UcMqttAcl
}
