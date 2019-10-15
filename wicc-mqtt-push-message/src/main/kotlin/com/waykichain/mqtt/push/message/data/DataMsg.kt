package com.waykichain.mqtt.push.message.data

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType

/**
 * @ClassName: DataMsg
 * @Date: 2019/9/20 14:42
 */
class DataMsg: MqttMsg(MqttMsgType.DATA.code) {
}