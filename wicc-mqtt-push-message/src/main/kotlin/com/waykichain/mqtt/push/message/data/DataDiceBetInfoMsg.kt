package com.waykichain.mqtt.push.message.data

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.*

@Service
class DataDiceBetInfoMsg: MqttMsg<DataDiceBetInfoMsg>(MqttMsgType.DATA_DICE_BET_INFO_MSG.code) {
    var walletAddress: String? = null
    var betAmount: BigDecimal? = null
    var betTime :Date? = null
}