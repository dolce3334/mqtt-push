package com.waykichain.mqtt.push.domain.message.officials

import com.waykichain.mqtt.push.domain.dict.MqttMsgType
import com.waykichain.mqtt.push.domain.message.MqttMsg

/**
 * @ClassName: OfficialsMsg
 * @Date: 2019/9/20 14:44
 */
class OfficialsMsg: MqttMsg(MqttMsgType.OFFICIALS.code) {
}