package com.waykichain.mqtt.push.domain.client.info

import com.waykichain.mqtt.push.domain.topic.MqttTopic
import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence

/**
 * @ClassName: OfficialsClientInfo
 * @Date: 2019/9/26 19:54
 */
class OfficialsClientInfo(var broker: String, var mqttUserInfo: MqttUserInfo): ClientInfo {

    override var client: MqttClient
        get() = MqttClient(broker, mqttUserInfo.clientId, MemoryPersistence())
        set(value) {}


    override var connOpts: MqttConnectOptions
        get() {
            val mqttConnectOptions = MqttConnectOptions()

            mqttConnectOptions.isCleanSession = false
            mqttConnectOptions.userName = mqttUserInfo.userName
            mqttConnectOptions.password = mqttUserInfo.password!!.toCharArray()

            return mqttConnectOptions
        }
        set(value) {}


    override var qos: Int
        get() = 1
        set(value) {}


    override var topic: String
        get() = MqttTopic.BW_OFFICIALS.message
        set(value) {}


}