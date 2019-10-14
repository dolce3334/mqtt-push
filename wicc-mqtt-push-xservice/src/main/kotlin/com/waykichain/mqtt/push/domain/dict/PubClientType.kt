package com.waykichain.mqtt.push.domain.dict

import com.waykichain.mqtt.push.commons.biz.dict.ErrorCode
import com.waykichain.mqtt.push.commons.biz.exception.BizException
import com.waykichain.mqtt.push.domain.client.info.*
import com.waykichain.mqtt.push.domain.environment.Environment

/**
 * @ClassName: PubClientType
 * @Description: 发布topic的客户端类型
 * @Date: 2019/9/27 10:30
 */
enum class PubClientType(val code: Int, val type: String, val description: String) {
    CUSTOMER(  100, "customer",  "发布用户相关信息的客户端"),
    ACCOUNT(   200, "account",   "发布账户相关信息的客户端"),
    DATA(      300, "data",      "发布数据相关信息的客户端"),
    ACTIVITY(  400, "activity",  "发布活动相关信息的客户端"),
    OFFICIALS( 500, "officials", "发布官方相关信息的客户端");


    companion object {
        fun getClientInfoByClientId(code: Int): ClientInfo {
            val mqttUserInfo = getMqttUserInfoByClientId(code)
            return when (code) {
                CUSTOMER.code -> CustomerClientInfo(Environment.MQTT_BROKER, mqttUserInfo)
                ACCOUNT.code -> AccountClientInfo(Environment.MQTT_BROKER, mqttUserInfo)
                DATA.code -> DataClientInfo(Environment.MQTT_BROKER, mqttUserInfo)
                ACTIVITY.code -> ActivityClientInfo(Environment.MQTT_BROKER, mqttUserInfo)
                OFFICIALS.code -> OfficialsClientInfo(Environment.MQTT_BROKER, mqttUserInfo)
                else -> throw BizException(ErrorCode.REQUEST_PARAM_ERROR)
            }
        }

        fun getMqttUserInfoByClientId(code: Int): MqttUserInfo {
            val mqttUserInfo = MqttUserInfo()
            when (code) {
                CUSTOMER.code -> {
                    mqttUserInfo.clientId = "customerClient"
                    mqttUserInfo.userName = Environment.MQTT_USER_CUSTOMER
                    mqttUserInfo.password = Environment.MQTT_PSSSWORD_CUSTOMER
                }
                ACCOUNT.code -> {
                    mqttUserInfo.clientId = "accountClient"
                    mqttUserInfo.userName = Environment.MQTT_USER_ACCOUNT
                    mqttUserInfo.password = Environment.MQTT_PSSSWORD_ACCOUNT
                }
                DATA.code -> {
                    mqttUserInfo.clientId = "dataClient"
                    mqttUserInfo.userName = Environment.MQTT_USER_DATA
                    mqttUserInfo.password = Environment.MQTT_PSSSWORD_DATA
                }
                ACTIVITY.code -> {
                    mqttUserInfo.clientId = "activityClient"
                    mqttUserInfo.userName = Environment.MQTT_USER_ACTIVITY
                    mqttUserInfo.password = Environment.MQTT_PSSSWORD_ACTIVITY
                }
                OFFICIALS.code -> {
                    mqttUserInfo.clientId = "officialsClient"
                    mqttUserInfo.userName = Environment.MQTT_USER_OFFICIALS
                    mqttUserInfo.password = Environment.MQTT_PSSSWORD_OFFICIALS
                }
                else -> throw BizException(ErrorCode.REQUEST_PARAM_ERROR)
            }
            return mqttUserInfo
        }

    }

}