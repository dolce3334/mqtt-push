package com.waykichain.mqtt.push.domain.message.customer

import com.waykichain.mqtt.push.domain.dict.MqttMsgType
import com.waykichain.mqtt.push.domain.message.MqttMsg

/**
 * @ClassName: CustomerMsg
 * @Date: 2019/9/20 14:42
 */
class CustomerMsg: MqttMsg(MqttMsgType.CUSTOMER.code) {
}