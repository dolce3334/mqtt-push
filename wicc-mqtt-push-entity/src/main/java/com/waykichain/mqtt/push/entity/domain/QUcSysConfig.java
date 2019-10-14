package com.waykichain.mqtt.push.entity.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUcSysConfig is a Querydsl query type for UcSysConfig
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUcSysConfig extends com.querydsl.sql.RelationalPathBase<UcSysConfig> {

    private static final long serialVersionUID = 633439882;

    public static final QUcSysConfig ucSysConfig = new QUcSysConfig("uc_sys_config");

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final NumberPath<Long> creatorUid = createNumber("creatorUid", Long.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath module = createString("module");

    public final StringPath name = createString("name");

    public final NumberPath<Long> opUid = createNumber("opUid", Long.class);

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public final StringPath value = createString("value");

    public final com.querydsl.sql.PrimaryKey<UcSysConfig> primary = createPrimaryKey(id);

    public QUcSysConfig(String variable) {
        super(UcSysConfig.class, forVariable(variable), "null", "uc_sys_config");
        addMetadata();
    }

    public QUcSysConfig(String variable, String schema, String table) {
        super(UcSysConfig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUcSysConfig(String variable, String schema) {
        super(UcSysConfig.class, forVariable(variable), schema, "uc_sys_config");
        addMetadata();
    }

    public QUcSysConfig(Path<? extends UcSysConfig> path) {
        super(path.getType(), path.getMetadata(), "null", "uc_sys_config");
        addMetadata();
    }

    public QUcSysConfig(PathMetadata metadata) {
        super(UcSysConfig.class, metadata, "null", "uc_sys_config");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(8).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(creatorUid, ColumnMetadata.named("creator_uid").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(description, ColumnMetadata.named("description").withIndex(5).ofType(Types.VARCHAR).withSize(256));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.BIGINT).withSize(20).notNull());
        addMetadata(module, ColumnMetadata.named("module").withIndex(2).ofType(Types.VARCHAR).withSize(64));
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.VARCHAR).withSize(128).notNull());
        addMetadata(opUid, ColumnMetadata.named("op_uid").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(9).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(value, ColumnMetadata.named("value").withIndex(4).ofType(Types.LONGVARCHAR).withSize(65535));
    }

}

