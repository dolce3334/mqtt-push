package com.waykichain.mqtt.push.domain.environment

import com.waykichain.commons.util.BaseEnv

object Environment {

    @JvmField
    var MQTT_BROKER = BaseEnv.env("MQTT_BROKER", "ws://10.0.0.4:8083")

    @JvmField
    var MQTT_USER_CUSTOMER = BaseEnv.env("MQTT_USER_CUSTOMER", "customer")

    @JvmField
    var MQTT_PSSSWORD_CUSTOMER = BaseEnv.env("MQTT_PSSSWORD_CUSTOMER", "1234")

    @JvmField
    var MQTT_USER_ACCOUNT = BaseEnv.env("MQTT_USER_ACCOUNT", "account")

    @JvmField
    var MQTT_PSSSWORD_ACCOUNT = BaseEnv.env("MQTT_PSSSWORD_ACCOUNT", "1234")

    @JvmField
    var MQTT_USER_DATA = BaseEnv.env("MQTT_USER_DATA", "data")

    @JvmField
    var MQTT_PSSSWORD_DATA = BaseEnv.env("MQTT_PSSSWORD_DATA", "1234")

    @JvmField
    var MQTT_USER_ACTIVITY = BaseEnv.env("MQTT_USER_ACTIVITY", "activity")

    @JvmField
    var MQTT_PSSSWORD_ACTIVITY = BaseEnv.env("MQTT_PSSSWORD_ACTIVITY", "1234")

    @JvmField
    var MQTT_USER_OFFICIALS = BaseEnv.env("MQTT_USER_OFFICIALS", "officials")

    @JvmField
    var MQTT_PSSSWORD_OFFICIALS = BaseEnv.env("MQTT_PSSSWORD_OFFICIALS", "1234")

}