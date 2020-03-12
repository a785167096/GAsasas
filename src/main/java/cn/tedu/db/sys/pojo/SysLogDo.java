package cn.tedu.db.sys.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
import java.util.Objects;

/**
 * 用于封装系统日志信息的实体类
 * @ClassName SysLogDo
 * @Description TODO
 * @Author hp
 * @Date 2020/3/8 18:16
 * @Version 1.0
 */
@Getter
@Setter
@ToString
public class SysLogDo {
    private long id;
    private String username;
    private String operation;
    private String method;
    private String params;
    private long time;
    private String ip;
    private Date createdTime;

    public SysLogDo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysLogDo)) return false;
        SysLogDo sysLogDo = (SysLogDo) o;
        return id == sysLogDo.id &&
                time == sysLogDo.time &&
                Objects.equals(username, sysLogDo.username) &&
                Objects.equals(operation, sysLogDo.operation) &&
                Objects.equals(method, sysLogDo.method) &&
                Objects.equals(params, sysLogDo.params) &&
                Objects.equals(ip, sysLogDo.ip) &&
                Objects.equals(createdTime, sysLogDo.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, operation, method, params, time, ip, createdTime);
    }
}