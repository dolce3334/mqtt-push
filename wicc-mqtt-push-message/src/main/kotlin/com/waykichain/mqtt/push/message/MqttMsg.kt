package com.waykichain.mqtt.push.message

import com.alibaba.fastjson.JSON

/**
 * @ClassName: MqttMsg
 * @Date: 2019/9/20 10:53
 */
abstract class MqttMsg<T : MqttMsg<T>>(var msgType: Int) {

    companion object {
        var mqttMsgMap: MutableMap<Int, MqttMsg<*>> = mutableMapOf()

        fun register(msgType: Int, mqttMsg: MqttMsg<*>) {
            mqttMsgMap[msgType] = mqttMsg
        }

        fun getMsg(msgType: Int): MqttMsg<*>? {
            return mqttMsgMap[msgType]
        }
    }

    init {
        register(this.msgType, this)
    }


    fun build(mqttMsg: Any): T{
        return JSON.parseObject(JSON.toJSONString(mqttMsg), this.javaClass) as T
    }

    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}