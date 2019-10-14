package com.waykichain.mqtt.push.entity.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUcMqttUser is a Querydsl query type for UcMqttUser
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUcMqttUser extends com.querydsl.sql.RelationalPathBase<UcMqttUser> {

    private static final long serialVersionUID = -560571500;

    public static final QUcMqttUser ucMqttUser = new QUcMqttUser("uc_mqtt_user");

    public final DateTimePath<java.util.Date> created = createDateTime("created", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isSuperuser = createBoolean("isSuperuser");

    public final StringPath password = createString("password");

    public final StringPath salt = createString("salt");

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<UcMqttUser> primary = createPrimaryKey(id);

    public QUcMqttUser(String variable) {
        super(UcMqttUser.class, forVariable(variable), "null", "uc_mqtt_user");
        addMetadata();
    }

    public QUcMqttUser(String variable, String schema, String table) {
        super(UcMqttUser.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUcMqttUser(String variable, String schema) {
        super(UcMqttUser.class, forVariable(variable), schema, "uc_mqtt_user");
        addMetadata();
    }

    public QUcMqttUser(Path<? extends UcMqttUser> path) {
        super(path.getType(), path.getMetadata(), "null", "uc_mqtt_user");
        addMetadata();
    }

    public QUcMqttUser(PathMetadata metadata) {
        super(UcMqttUser.class, metadata, "null", "uc_mqtt_user");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("created").withIndex(6).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isSuperuser, ColumnMetadata.named("is_superuser").withIndex(5).ofType(Types.BIT));
        addMetadata(password, ColumnMetadata.named("password").withIndex(3).ofType(Types.VARCHAR).withSize(100));
        addMetadata(salt, ColumnMetadata.named("salt").withIndex(4).ofType(Types.VARCHAR).withSize(35));
        addMetadata(username, ColumnMetadata.named("username").withIndex(2).ofType(Types.VARCHAR).withSize(100));
    }

}

