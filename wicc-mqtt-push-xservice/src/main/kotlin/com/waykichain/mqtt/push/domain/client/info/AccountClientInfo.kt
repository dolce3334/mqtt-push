package com.waykichain.mqtt.push.domain.client.info

import com.waykichain.mqtt.push.domain.topic.MqttTopic
import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence

/**
 * @ClassName: AccountClientInfo
 * @Date: 2019/9/20 15:10
 */
class AccountClientInfo(var broker: String, var mqttUserInfo: MqttUserInfo): ClientInfo {

    override var client: MqttClient
        get() = MqttClient(broker, mqttUserInfo.clientId, MemoryPersistence())
        set(value) {}


    override var connOpts: MqttConnectOptions
        get() {
            val mqttConnectOptions = MqttConnectOptions()

            /**
             * ‘Clean Session’设置为0，表示创建一个持久会话，在客户端断开连接时，会话仍然保持并保存离线消息，直到会话超时注销。
             * ‘Clean Session’设置为1，表示创建一个新的临时会话，在客户端断开时，会话自动销毁
             */
            mqttConnectOptions.isCleanSession = false
            mqttConnectOptions.userName = mqttUserInfo.userName
            mqttConnectOptions.password = mqttUserInfo.password!!.toCharArray()

            return mqttConnectOptions
        }
        set(value) {}


    override var qos: Int
        get() = 2
        set(value) {}


    override var topic: String
        get() = MqttTopic.BW_ACCOUNT.message
        set(value) {}

}