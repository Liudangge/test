package com.example.security.service;

import com.example.security.entity.SysLogs;
import java.util.List;

/**
 * (SysLogs)表服务接口
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public interface SysLogsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysLogs queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysLogs> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysLogs 实例对象
     * @return 实例对象
     */
    SysLogs insert(SysLogs sysLogs);

    /**
     * 修改数据
     *
     * @param sysLogs 实例对象
     * @return 实例对象
     */
    SysLogs update(SysLogs sysLogs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}