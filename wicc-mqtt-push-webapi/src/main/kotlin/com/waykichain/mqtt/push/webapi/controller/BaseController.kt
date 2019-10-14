package com.waykichain.mqtt.push.webapi.controller

import org.springframework.beans.factory.annotation.Autowired
import java.net.InetAddress
import javax.servlet.http.HttpServletRequest


open class BaseController {

    @Autowired
    protected lateinit var request: HttpServletRequest

    protected fun getUserId(): Long {
        return request.getAttribute("sysuser_id").toString().toLong()
    }

    protected fun getToken() = request.getHeader("atoken")

    protected fun getIpAddr(request: HttpServletRequest): String? {

        var ip: String? = request.getHeader("x-forwarded-for")
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.getHeader("Proxy-Client-IP")
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.getHeader("WL-Proxy-Client-IP")
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.remoteAddr
            if (ip == "127.0.0.1") {
                //根据网卡取本机配置的IP
                var inet: InetAddress? = null
                try {
                    inet = InetAddress.getLocalHost()
                } catch (e: Exception) {
                    e.printStackTrace()
                }

                ip = inet!!.hostAddress
            }
        }

        // 多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ip != null && ip.length > 15) {
            if (ip.indexOf(",") > 0) {
                ip = ip.substring(0, ip.indexOf(","))
            }
        }
        return ip
    }


}




