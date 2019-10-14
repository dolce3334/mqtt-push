package com.waykichain.mqtt.push.domain.client.info

import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions

/**
 * @ClassName: ClientInfo
 * @description: 客户端通用的信息，其实现类主要是提供一些默认值，topic在这里只提供到两级，可以直接在后面追加下级，qos也是提供默认值，需要定制时及时更改
 * @Date: 2019/9/20 12:02
 */
interface ClientInfo {
    var client: MqttClient
    var connOpts: MqttConnectOptions
    var qos: Int
    var topic: String
}