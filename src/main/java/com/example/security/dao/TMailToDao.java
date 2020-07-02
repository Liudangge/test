package com.example.security.dao;

import com.example.security.entity.TMailTo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TMailTo)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public interface TMailToDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMailTo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TMailTo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tMailTo 实例对象
     * @return 对象列表
     */
    List<TMailTo> queryAll(TMailTo tMailTo);

    /**
     * 新增数据
     *
     * @param tMailTo 实例对象
     * @return 影响行数
     */
    int insert(TMailTo tMailTo);

    /**
     * 修改数据
     *
     * @param tMailTo 实例对象
     * @return 影响行数
     */
    int update(TMailTo tMailTo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}