package com.waykichain.mqtt.push.domain.client.info

import com.waykichain.mqtt.push.domain.topic.MqttTopic
import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence

/**
 * @ClassName: DataClientInfo
 * @Date: 2019/9/26 18:14
 */
class DataClientInfo(var broker: String, var mqttUserInfo: MqttUserInfo): ClientInfo {

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
        get() = 0
        set(value) {}


    override var topic: String
        get() = MqttTopic.BW_DATA.message
        set(value) {}

}