package com.waykichain.mqtt.push.message.activity

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType

/**
 * @ClassName: ActivityMsg
 * @Date: 2019/9/20 14:43
 */
class ActivityMsg: MqttMsg(MqttMsgType.ACTIVITY.code) {
}