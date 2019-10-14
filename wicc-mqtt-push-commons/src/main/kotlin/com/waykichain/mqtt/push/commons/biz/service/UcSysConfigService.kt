package com.waykichain.mqtt.push.commons.biz.service

import com.waykichain.mqtt.push.entity.domain.UcSysConfig

interface UcSysConfigService {
    fun getById(id:Long): UcSysConfig?

    fun save(ucSysConfig: UcSysConfig): UcSysConfig
}
