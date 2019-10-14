package com.waykichain.mqtt.push.domain.client


import com.waykichain.mqtt.push.domain.client.info.ClientInfo
import org.slf4j.LoggerFactory

/**
 * @ClassName: SubscribeClient
 * @Date: 2019/9/20 14:04
 */
object SubscribeClient {

    fun subscribeTopic(clientInfo: ClientInfo) {
        try {
            val client = clientInfo.client
            val connOpts = clientInfo.connOpts

            client.connect(connOpts)
            client.subscribe(clientInfo.topic, clientInfo.qos)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    val logger = LoggerFactory.getLogger(javaClass)
}