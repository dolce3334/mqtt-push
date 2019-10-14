package com.waykichain.mqtt.push.domain.dict

/**
 * @ClassName: MqttMsgType
 * @Date: 2019/9/20 14:44
 */
enum class MqttMsgType(val code: Int, val desp: String) {

    /**玩家相关消息 type为 100-199*/
    CUSTOMER(     100, "玩家相关消息"),


    /**账户相关消息 type为 200-299*/
    ACCOUNT(                        200, "账户相关消息"),
    ACCOUNT_RECHARGE_FINISHED(      201, "充值到账"),


    /**数据相关消息 type为 300-399*/
    DATA(         300, "数据相关消息"),


    /**活动相关消息 type为 400-499*/
    ACTIVITY(     400, "活动相关消息"),


    /**官方消息 type为 500-599*/
    OFFICIALS(    500, "官方消息");
}