package com.waykichain.mqtt.push.message.activity

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import org.springframework.stereotype.Service

/**
 * @ClassName: ActivityMsg
 * @Date: 2019/9/20 14:43
 */
@Service
class ActivityMsg: MqttMsg<ActivityMsg>(MqttMsgType.ACTIVITY.code) {
    init {
        register(this.msgType, this)
    }
}