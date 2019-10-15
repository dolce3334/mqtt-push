package com.waykichain.mqtt.push.message

import com.alibaba.fastjson.JSON

/**
 * @ClassName: MqttMsg
 * @Date: 2019/9/20 10:53
 */
open class MqttMsg(var msgType: Int) {

    var content: String? = null

    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}