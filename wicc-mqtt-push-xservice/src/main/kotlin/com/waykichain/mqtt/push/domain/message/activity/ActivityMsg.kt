package com.waykichain.mqtt.push.domain.message.activity

import com.waykichain.mqtt.push.domain.dict.MqttMsgType
import com.waykichain.mqtt.push.domain.message.MqttMsg

/**
 * @ClassName: ActivityMsg
 * @Date: 2019/9/20 14:43
 */
class ActivityMsg: MqttMsg(MqttMsgType.ACTIVITY.code) {
}