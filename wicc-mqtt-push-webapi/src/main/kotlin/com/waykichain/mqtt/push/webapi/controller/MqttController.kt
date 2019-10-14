package com.waykichain.mqtt.push.webapi.controller

import com.alibaba.fastjson.JSON
import com.waykichain.commons.base.BizResponse
import com.waykichain.mqtt.push.commons.biz.domain.PubTopicRequest
import com.waykichain.mqtt.push.domain.client.PublishClient
import com.waykichain.mqtt.push.domain.dict.PubClientType
import com.waykichain.mqtt.push.domain.message.MqttMsg
import com.waykichain.mqtt.push.domain.message.customer.CustomerMsg
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

/**
 * @ClassName: MqttController
 * @Description: 提供MQTT相关服务，主要是用于发布topic
 * @Date: 2019/9/27 9:42
 */
@Api("mqtt发布topic")
@RequestMapping("/mqtt")
@RestController
class MqttController {

    /**
     * 请求体为要发布话题的负载payload（二进制字节流）
     * 请求头包含必选参数 PubClientType  topic  MqttMsgType
     * 请求头可选参数 OQS
     */
    @ApiOperation("发布话题", httpMethod = "POST")
    @RequestMapping("/pub")
    fun publishTopic(@RequestBody request: PubTopicRequest): BizResponse<*> {

        /**获取对应发送消息的客户端，同时添加定制信息*/
        val clientInfo = PubClientType.getClientInfoByClientId(request.pubClientType!!)
        if (request.topic != null) {
            clientInfo.topic = clientInfo.topic + "/" + request.topic
        }
        if (request.qos != null) clientInfo.qos = request.qos!!

        /**话题发布*/
        PublishClient.publishTopic(clientInfo, MqttMsg(request.mqttMsgType!!).also { it.content = request.content })
        return BizResponse("")
    }

}
