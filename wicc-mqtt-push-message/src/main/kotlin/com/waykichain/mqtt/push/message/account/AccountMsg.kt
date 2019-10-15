package com.waykichain.mqtt.push.message.account

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType

/**
 * @ClassName: AccountMsg
 * @Date: 2019/9/20 14:31
 */
class AccountMsg: MqttMsg(MqttMsgType.ACCOUNT_RECHARGE_FINISHED.code) {}