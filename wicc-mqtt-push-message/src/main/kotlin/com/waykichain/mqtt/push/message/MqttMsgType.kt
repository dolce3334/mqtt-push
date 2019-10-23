package com.waykichain.mqtt.push.message

/**
 * @ClassName: MqttMsgType
 * @Date: 2019/9/20 14:44
 */
enum class MqttMsgType(val code: Int, val desp: String, val className: String) {

    /**玩家相关消息 type为 100-199*/
    CUSTOMER(     100, "玩家相关消息", "com.waykichain.mqtt.push.message.customer.CustomerMsg"),


    /**账户相关消息 type为 200-299*/
    ACCOUNT(                        200, "账户相关消息", "com.waykichain.mqtt.push.message.account.AccountMsg"),
    ACCOUNT_RECHARGE_FINISHED(      201, "充值到账", "com.waykichain.mqtt.push.message.account.AccountMsg"),


    /**数据相关消息 type为 300-399*/
    DATA(         300, "数据相关消息", "com.waykichain.mqtt.push.message.data.DataMsg"),
    DATA_DICE_LOTTERY_INFO_MSG(301, "dice游戏开奖信息", "com.waykichain.mqtt.push.message.data.DataDiceLotteryInfoMsg"),
    DATA_DICE_JACKPOT_INFO_MSG(302, "dice游戏奖池信息", "com.waykichain.mqtt.push.message.data.DataDiceJackpotInfoMsg"),
    DATA_DICE_TOP_PRIZE_INFO_MSG(303, "dice游戏大奖信息", "com.waykichain.mqtt.push.message.data.DataDiceTopPrizeInfoMsg"),

    /**活动相关消息 type为 400-499*/
    ACTIVITY(     400, "活动相关消息", "com.waykichain.mqtt.push.message.activity.ActivityMsg"),


    /**官方消息 type为 500-599*/
    OFFICIALS(    500, "官方消息", "com.waykichain.mqtt.push.message.officials.OfficialsMsg");


    companion object {
        fun getMqttMsgTypeByCode(code: Int): MqttMsgType? {
            values().forEach {
                if (it.code == code) return it
            }
            return null
        }
    }

}