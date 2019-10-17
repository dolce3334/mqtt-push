package com.waykichain.mqtt.push.message.data

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import org.springframework.stereotype.Service

/**
 * @ClassName: DataMsg
 * @Date: 2019/9/20 14:42
 */
@Service
class DataMsg: MqttMsg<DataMsg>(MqttMsgType.DATA.code) {

}