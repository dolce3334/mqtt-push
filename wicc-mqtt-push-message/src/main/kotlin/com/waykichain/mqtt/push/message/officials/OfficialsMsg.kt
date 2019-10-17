package com.waykichain.mqtt.push.message.officials

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import org.springframework.stereotype.Service

/**
 * @ClassName: OfficialsMsg
 * @Date: 2019/9/20 14:44
 */
@Service
class OfficialsMsg: MqttMsg<OfficialsMsg>(MqttMsgType.OFFICIALS.code) {

}