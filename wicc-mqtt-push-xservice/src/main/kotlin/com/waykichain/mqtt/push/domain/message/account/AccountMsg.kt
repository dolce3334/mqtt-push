package com.waykichain.mqtt.push.domain.message.account

import com.waykichain.mqtt.push.domain.dict.MqttMsgType
import com.waykichain.mqtt.push.domain.message.MqttMsg

/**
 * @ClassName: AccountMsg
 * @Date: 2019/9/20 14:31
 */
class AccountMsg: MqttMsg(MqttMsgType.ACCOUNT_RECHARGE_FINISHED.code) {}