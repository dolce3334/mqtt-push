package com.waykichain.mqtt.push.message.customer

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType

/**
 * @ClassName: CustomerMsg
 * @Date: 2019/9/20 14:42
 */
class CustomerMsg: MqttMsg(MqttMsgType.CUSTOMER.code) {
}