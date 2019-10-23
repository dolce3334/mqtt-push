package com.waykichain.mqtt.push.message.data

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import io.swagger.annotations.ApiModelProperty
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class DataDiceTopPrizeInfoMsg: MqttMsg<DataDiceTopPrizeInfoMsg>(MqttMsgType.DATA_DICE_TOP_PRIZE_INFO_MSG.code) {
    @ApiModelProperty("用户")
    var walletAddress: String? = null

    @ApiModelProperty("中奖金额")
    var amount: BigDecimal? = BigDecimal.ZERO

}