package com.example.security.service;

import com.example.security.entity.TJob;
import java.util.List;

/**
 * (TJob)表服务接口
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public interface TJobService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TJob queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TJob> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tJob 实例对象
     * @return 实例对象
     */
    TJob insert(TJob tJob);

    /**
     * 修改数据
     *
     * @param tJob 实例对象
     * @return 实例对象
     */
    TJob update(TJob tJob);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}