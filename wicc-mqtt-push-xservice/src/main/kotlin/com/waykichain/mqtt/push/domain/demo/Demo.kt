package com.waykichain.mqtt.push.domain.demo

import com.waykichain.mqtt.push.domain.client.PublishClient
import com.waykichain.mqtt.push.domain.client.info.AccountClientInfo
import com.waykichain.mqtt.push.domain.client.info.MqttUserInfo
import com.waykichain.mqtt.push.domain.environment.Environment
import com.waykichain.mqtt.push.domain.message.account.AccountMsg

object Demo {

    @JvmStatic
    fun main(args: Array<String>) {
        val broker = Environment.MQTT_BROKER

        val mqttUserInfo = MqttUserInfo()
        mqttUserInfo.clientId = "accountClient"
        mqttUserInfo.userName = "account"
        mqttUserInfo.password = "1234"

        val accountClientInfo = AccountClientInfo(broker, mqttUserInfo)

        val message = AccountMsg()
        PublishClient.publishTopic(accountClientInfo, message)

    }

}