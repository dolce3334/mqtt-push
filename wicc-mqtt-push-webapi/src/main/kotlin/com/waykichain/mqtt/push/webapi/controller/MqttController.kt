package com.waykichain.mqtt.push.webapi.controller

import com.waykichain.commons.base.BizResponse
import com.waykichain.mqtt.push.domain.client.PublishClient
import com.waykichain.mqtt.push.domain.dict.PubClientType
import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.PubTopicRequest
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @ClassName: MqttController
 * @Description: 提供MQTT相关服务，主要是用于发布topic
 * @Date: 2019/9/27 9:42
 */
@Api("mqtt发布topic")
@RequestMapping("/mqtt")
@RestController
class MqttController {

    @ApiOperation("发布话题", httpMethod = "POST")
    @RequestMapping("/pub")
    fun publishTopic(@RequestBody request: PubTopicRequest): BizResponse<*> {

        /**获取对应发送消息的客户端，同时添加定制信息*/
        val clientInfo = PubClientType.getClientInfoByMsgType(request.mqttMsgType!!)
        if (request.topic != null) {
            clientInfo.topic = clientInfo.topic + "/" + request.topic
        }
        if (request.qos != null) clientInfo.qos = request.qos!!

        val mqttMsg  = MqttMsg.getMsg(request.mqttMsgType!!)!!.build(request.mqttMsg!!)
        mqttMsg.msgType = request.mqttMsgType

        println(mqttMsg)

        /**话题发布*/
        PublishClient.publishTopic(clientInfo, mqttMsg)
        return BizResponse("")
    }

}
