package com.waykichain.mqtt.push.domain.client

import com.waykichain.mqtt.push.domain.client.info.ClientInfo
import com.waykichain.mqtt.push.domain.message.MqttMsg
import org.eclipse.paho.client.mqttv3.MqttException
import org.eclipse.paho.client.mqttv3.MqttMessage
import org.slf4j.LoggerFactory

/**
 * @ClassName: PublishClient
 * @Date: 2019/9/20 10:47
 */
object PublishClient {

    fun publishTopic(clientInfo: ClientInfo, message: MqttMsg) {

        try {
            val client = clientInfo.client
            client.connect(clientInfo.connOpts)

            val mqttMessage = MqttMessage(message.toString().toByteArray())
//            val mqttMessage = MqttMessage(message.content)

            mqttMessage.qos = clientInfo.qos

            client.publish(clientInfo.topic, mqttMessage)
            client.disconnect()
            client.close()

            logger.info("publish topic ${clientInfo.topic}, ")
        } catch (me: MqttException) {
            logger.error("reason: ${me.reasonCode} || msg: ${me.message} || loc: ${me.localizedMessage} || cause: ${me.cause} || exception: $me")
            me.printStackTrace()
        }

    }

    val logger = LoggerFactory.getLogger(javaClass)
}
