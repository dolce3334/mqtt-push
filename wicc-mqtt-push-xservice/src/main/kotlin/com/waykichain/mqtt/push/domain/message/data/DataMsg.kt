package com.waykichain.mqtt.push.domain.message.data

import com.waykichain.mqtt.push.domain.dict.MqttMsgType
import com.waykichain.mqtt.push.domain.message.MqttMsg

/**
 * @ClassName: DataMsg
 * @Date: 2019/9/20 14:42
 */
class DataMsg: MqttMsg(MqttMsgType.DATA.code) {
}