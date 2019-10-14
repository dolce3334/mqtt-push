package com.waykichain.mqtt.push.entity.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUcMqttAcl is a Querydsl query type for UcMqttAcl
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUcMqttAcl extends com.querydsl.sql.RelationalPathBase<UcMqttAcl> {

    private static final long serialVersionUID = 1367370657;

    public static final QUcMqttAcl ucMqttAcl = new QUcMqttAcl("uc_mqtt_acl");

    public final NumberPath<Integer> access = createNumber("access", Integer.class);

    public final NumberPath<Integer> allow = createNumber("allow", Integer.class);

    public final StringPath clientid = createString("clientid");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath ipaddr = createString("ipaddr");

    public final StringPath topic = createString("topic");

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<UcMqttAcl> primary = createPrimaryKey(id);

    public QUcMqttAcl(String variable) {
        super(UcMqttAcl.class, forVariable(variable), "null", "uc_mqtt_acl");
        addMetadata();
    }

    public QUcMqttAcl(String variable, String schema, String table) {
        super(UcMqttAcl.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUcMqttAcl(String variable, String schema) {
        super(UcMqttAcl.class, forVariable(variable), schema, "uc_mqtt_acl");
        addMetadata();
    }

    public QUcMqttAcl(Path<? extends UcMqttAcl> path) {
        super(path.getType(), path.getMetadata(), "null", "uc_mqtt_acl");
        addMetadata();
    }

    public QUcMqttAcl(PathMetadata metadata) {
        super(UcMqttAcl.class, metadata, "null", "uc_mqtt_acl");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(access, ColumnMetadata.named("access").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(allow, ColumnMetadata.named("allow").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(clientid, ColumnMetadata.named("clientid").withIndex(5).ofType(Types.VARCHAR).withSize(100));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(ipaddr, ColumnMetadata.named("ipaddr").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(topic, ColumnMetadata.named("topic").withIndex(7).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(username, ColumnMetadata.named("username").withIndex(4).ofType(Types.VARCHAR).withSize(100));
    }

}

