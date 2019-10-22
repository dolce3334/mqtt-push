package com.waykichain.mqtt.push.message.data

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import io.swagger.annotations.ApiModelProperty
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class DataDiceJackpotInfoMsg: MqttMsg<DataDiceJackpotInfoMsg>(MqttMsgType.DATA_DICE_LOTTERY_INFO_MSG.code) {

    @ApiModelProperty(value = "奖池金额")
    var jackpotAmount: BigDecimal? = null

    @ApiModelProperty(value = "最大下注金额")
    var maxBetMoney: BigDecimal? = 30.toBigDecimal()
}