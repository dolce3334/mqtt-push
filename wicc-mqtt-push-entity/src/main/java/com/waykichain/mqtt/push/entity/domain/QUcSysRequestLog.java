package com.waykichain.mqtt.push.entity.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUcSysRequestLog is a Querydsl query type for UcSysRequestLog
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUcSysRequestLog extends com.querydsl.sql.RelationalPathBase<UcSysRequestLog> {

    private static final long serialVersionUID = -1779099267;

    public static final QUcSysRequestLog ucSysRequestLog = new QUcSysRequestLog("uc_sys_request_log");

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath deviceUuid = createString("deviceUuid");

    public final NumberPath<Integer> errorCode = createNumber("errorCode", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath method = createString("method");

    public final StringPath module = createString("module");

    public final StringPath requestHeaders = createString("requestHeaders");

    public final StringPath requestIp = createString("requestIp");

    public final StringPath requestParmas = createString("requestParmas");

    public final StringPath requestUri = createString("requestUri");

    public final StringPath requestUrl = createString("requestUrl");

    public final StringPath requestUuid = createString("requestUuid");

    public final StringPath response = createString("response");

    public final NumberPath<Long> responseTime = createNumber("responseTime", Long.class);

    public final StringPath stackTrace = createString("stackTrace");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final com.querydsl.sql.PrimaryKey<UcSysRequestLog> primary = createPrimaryKey(id);

    public QUcSysRequestLog(String variable) {
        super(UcSysRequestLog.class, forVariable(variable), "null", "uc_sys_request_log");
        addMetadata();
    }

    public QUcSysRequestLog(String variable, String schema, String table) {
        super(UcSysRequestLog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUcSysRequestLog(String variable, String schema) {
        super(UcSysRequestLog.class, forVariable(variable), schema, "uc_sys_request_log");
        addMetadata();
    }

    public QUcSysRequestLog(Path<? extends UcSysRequestLog> path) {
        super(path.getType(), path.getMetadata(), "null", "uc_sys_request_log");
        addMetadata();
    }

    public QUcSysRequestLog(PathMetadata metadata) {
        super(UcSysRequestLog.class, metadata, "null", "uc_sys_request_log");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(17).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(customerId, ColumnMetadata.named("customer_id").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(deviceUuid, ColumnMetadata.named("device_uuid").withIndex(4).ofType(Types.VARCHAR).withSize(64));
        addMetadata(errorCode, ColumnMetadata.named("error_code").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.BIGINT).withSize(20).notNull());
        addMetadata(method, ColumnMetadata.named("method").withIndex(6).ofType(Types.VARCHAR).withSize(11));
        addMetadata(module, ColumnMetadata.named("module").withIndex(7).ofType(Types.VARCHAR).withSize(64));
        addMetadata(requestHeaders, ColumnMetadata.named("request_headers").withIndex(11).ofType(Types.LONGVARCHAR).withSize(65535));
        addMetadata(requestIp, ColumnMetadata.named("request_ip").withIndex(8).ofType(Types.VARCHAR).withSize(64));
        addMetadata(requestParmas, ColumnMetadata.named("request_parmas").withIndex(9).ofType(Types.LONGVARCHAR).withSize(65535));
        addMetadata(requestUri, ColumnMetadata.named("request_uri").withIndex(10).ofType(Types.VARCHAR).withSize(256));
        addMetadata(requestUrl, ColumnMetadata.named("request_url").withIndex(13).ofType(Types.VARCHAR).withSize(512));
        addMetadata(requestUuid, ColumnMetadata.named("request_uuid").withIndex(2).ofType(Types.VARCHAR).withSize(32));
        addMetadata(response, ColumnMetadata.named("response").withIndex(12).ofType(Types.LONGVARCHAR).withSize(2147483647));
        addMetadata(responseTime, ColumnMetadata.named("response_time").withIndex(14).ofType(Types.BIGINT).withSize(19));
        addMetadata(stackTrace, ColumnMetadata.named("stack_trace").withIndex(15).ofType(Types.LONGVARCHAR).withSize(65535));
        addMetadata(timestamp, ColumnMetadata.named("timestamp").withIndex(16).ofType(Types.BIGINT).withSize(19));
    }

}

