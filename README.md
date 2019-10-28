
定制并发布一条消息的步骤：
第一步：MqttMsgType中新增一种消息类型
DATA_DICE_LOTTERY_INFO_MSG(301, "dice游戏开奖信息", "com.waykichain.mqtt.push.message.data.DataDiceLotteryInfoMsg"),

第一个是消息的标识，用于解析消息体用；
第二个是消息说明，管理后台模拟推送消息会用于展示；
第三个是类名，是用于管理后台反射获取类的变量；

第二步：定义消息内容
@Service
class DataDiceLotteryInfoMsg: MqttMsg<DataDiceLotteryInfoMsg>(MqttMsgType.DATA_DICE_LOTTERY_INFO_MSG.code) {
    @ApiModelProperty(value = "区块高度")
    var lotteryHashHeight: Long? = null

    @ApiModelProperty(value = "区块hash")
    var lotteryHash: String? = null

    @ApiModelProperty(value = "开奖号码")
    var  lotteryNum: Int? = 0

    @ApiModelProperty(value = "开奖时间")
    var lotteryAt: Date? = null
}


泛型是为了获取类本身，构造函数传入msgType，里面的变量就是自己定义的要发送的消息

第三步，更新gradle版本，需要推送的地方更新一下依赖
compile 'com.waykichain:wicc-mqtt-push-message:0.1800.13-SNAPSHOT'


第四步，编写应用推送方法
fun pubLotteryMsg(lotteryRecord: DiceLotteryRecord) {
    val client = JsonRpcClient(Environment.MQTT_PUB_URL, true)

    val msg = DataDiceLotteryInfoMsg()
    val dsf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    msg.lotteryAt = dsf.format(lotteryRecord.createdAt)
    msg.lotteryHash = lotteryRecord.lotteryHash
    msg.lotteryHashHeight = lotteryRecord.lotteryHashHeight
    msg.lotteryNum = lotteryRecord.lotteryNum

    val request = PubTopicRequest()
    request.mqttMsg = msg
    request.mqttMsgType = MqttMsgType.DATA_DICE_LOTTERY_INFO_MSG.code

    client.executeJsonPost(request, BizResponse::class.java)
}


主要内容是构造要发送的消息DataDiceLotteryInfoMsg并赋值，构造http请求PubTopicRequest传入msg和mqttMsgType ，然后发送http请求即可，接口地址测试时用http://10.0.0.4:28001/mqtt/pub


PubTopicRequest这里做一下说明
@ApiModel
class PubTopicRequest {

    @ApiModelProperty("发布改消息内容")
    var mqttMsg: Any? = null

    @ApiModelProperty("发送消息的话题")
    var topic: String? = null

    @ApiModelProperty("发送的消息类型")
    var mqttMsgType: Int? = null

    @ApiModelProperty("发布话题质量")
    var qos: Int? = null
}


mqttMsg：这个是为了统一推送的接口，用这个接收要推送的消息，用反射还原发送的消息；
topic：每个消息都属于一个话题，目前设定的100-599类型的消息根据其区间设定了固定的话题，如果是一对一推送这里后面需要添加玩家的地址以区分，其他情况下有提供的默认值即可，不需要传参；
mqttMsgType：要发送的消息的类别，区分消息用的；
qos：这个是发布消息的质量，有提供默认值，这里是指消息推送到服务器的质量，0代表不一定能接收到，1代表至少接收到1次，2代表保证接收到1次。