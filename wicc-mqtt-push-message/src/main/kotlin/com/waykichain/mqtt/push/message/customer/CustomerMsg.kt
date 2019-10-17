package com.waykichain.mqtt.push.message.customer

import com.waykichain.mqtt.push.message.MqttMsg
import com.waykichain.mqtt.push.message.MqttMsgType
import com.waykichain.mqtt.push.message.account.AccountMsg
import org.springframework.stereotype.Service
import java.math.BigDecimal

/**
 * @ClassName: CustomerMsg
 * @Date: 2019/9/20 14:42
 */
@Service
class CustomerMsg: MqttMsg<CustomerMsg>(MqttMsgType.CUSTOMER.code) {

    init {
        register(this.msgType, this)
    }

    var name: String? = null
    var age: Int? = null
    var abc: BigDecimal? = null
    var efg: Long? = null
    var hij: Double? = null
    var klm: Boolean? = null
}