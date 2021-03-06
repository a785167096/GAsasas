package cn.tedu.db.sys.mapper;

import cn.tedu.db.sys.pojo.SysLogDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysLogMapper {

    /**
     *   基于条件查询日志记录条数
     *   如果username为null或空字符串，则返回所有日志记录条数
     *   如果一个参数要被用于动态SQL，则有2种方式：
     * 1. 参数前加@Param注解   （推荐）
     * 2. 在动态SQL中使用默认生成的变量名"_parameter" (不好记)
     * @param username 用户名
     * @return 日志条数
     */
    int getRowCount(@Param("username") String username);

    /**
     * 基于条件查询一页的日志数据
     * @param username 用户名
     * @param recordIndex 起始数据下标
     * @param pageSize 数据条数
     * @return 该页日志数据
     */
    List<SysLogDo>listSysLog(@Param("username") String username, @Param("recordIndex") int recordIndex, @Param("pageSize") int pageSize);
}
