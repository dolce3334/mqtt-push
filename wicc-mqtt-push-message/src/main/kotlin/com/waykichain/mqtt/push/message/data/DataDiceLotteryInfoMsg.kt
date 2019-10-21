package com.waykichain.mqtt.push.message.data

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import io.swagger.annotations.ApiModelProperty
import org.springframework.stereotype.Service
import java.util.*


@Service
class DataDiceLotteryInfoMsg: MqttMsg<DataDiceLotteryInfoMsg>(MqttMsgType.DATA_DICE_LOTTERY_INFO_MSG.code) {
    @ApiModelProperty(value = "区块高度")
    var lotteryHashHeight: Long? = null

    @ApiModelProperty(value = "区块hash")
    var lotteryHash: String? = null

    @ApiModelProperty(value = "开奖号码")
    var  lotteryNum: Int? = 0

    @ApiModelProperty(value = "开奖时间")
    var lotteryAt: Date? = null
}