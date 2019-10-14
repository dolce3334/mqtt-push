package com.waykichain.mqtt.push.entity.domain;

import javax.persistence.Entity;
import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.DynamicUpdate;
import com.querydsl.sql.Column;
import org.hibernate.annotations.DynamicInsert;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * UcMqttAcl is a Querydsl bean type
 */
@Entity
@DynamicInsert
@DynamicUpdate
public class UcMqttAcl implements Serializable {

    @Column("access")
    private Integer access;

    @Column("allow")
    private Integer allow;

    @Column("clientid")
    private String clientid;

    @Column("id")
    @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column("ipaddr")
    private String ipaddr;

    @Column("topic")
    private String topic;

    @Column("username")
    private String username;

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public Integer getAllow() {
        return allow;
    }

    public void setAllow(Integer allow) {
        this.allow = allow;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

