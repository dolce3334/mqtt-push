package com.waykichain.mqtt.push.domain.topic

/**
 * @ClassName: MqttTopic
 * @Date: 2019/9/20 15:56
 */
enum class MqttTopic(val message: String) {
    BW_ACCOUNT("bw/account"),
    BW_ACTIVITY("bw/activity"),
    BW_DATA("bw/data"),
    BW_CUSTOMER("bw/customer"),
    BW_OFFICIALS("bw/officials"),
}