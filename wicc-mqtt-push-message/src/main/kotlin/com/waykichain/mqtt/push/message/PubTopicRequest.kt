package com.waykichain.mqtt.push.message

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

/**
 * @ClassName: PubTopicRequest
 * @Date: 2019/10/14 15:10
 */
@ApiModel
class PubTopicRequest {

    @ApiModelProperty("发布改消息内容")
    var mqttMsg: MqttMsg? = null

    //不需要前端传递，根据msgType自适应
//    var pubClientType: Int? = null

    @ApiModelProperty("发送消息的话题")
    var topic: String? = null

    @ApiModelProperty("发送的消息类型")
    var mqttMsgType: Int? = null

    @ApiModelProperty("发布话题质量")
    var qos: Int? = null
}