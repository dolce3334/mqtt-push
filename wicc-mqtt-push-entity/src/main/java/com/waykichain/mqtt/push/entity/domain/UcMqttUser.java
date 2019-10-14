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
 * UcMqttUser is a Querydsl bean type
 */
@Entity
@DynamicInsert
@DynamicUpdate
public class UcMqttUser implements Serializable {

    @Column("created")
    private java.util.Date created;

    @Column("id")
    @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column("is_superuser")
    private Boolean isSuperuser;

    @Column("password")
    private String password;

    @Column("salt")
    private String salt;

    @Column("username")
    private String username;

    public java.util.Date getCreated() {
        return created;
    }

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsSuperuser() {
        return isSuperuser;
    }

    public void setIsSuperuser(Boolean isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

