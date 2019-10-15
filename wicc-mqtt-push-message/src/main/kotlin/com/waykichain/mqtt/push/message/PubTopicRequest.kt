package com.waykichain.mqtt.push.message

/**
 * @ClassName: PubTopicRequest
 * @Date: 2019/10/14 15:10
 */
class PubTopicRequest {

    var mqttMsg: MqttMsg? = null

    var pubClientType: Int? = null

    var topic: String? = null

    var mqttMsgType: Int? = null

    var qos: Int? = null
}