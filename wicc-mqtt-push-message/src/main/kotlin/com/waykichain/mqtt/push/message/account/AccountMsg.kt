package com.waykichain.mqtt.push.message.account

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import org.springframework.stereotype.Service

/**
 * @ClassName: AccountMsg
 * @Date: 2019/9/20 14:31
 */
@Service
class AccountMsg: MqttMsg<AccountMsg>(MqttMsgType.ACCOUNT.code) {

}