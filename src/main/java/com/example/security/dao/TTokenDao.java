package com.example.security.dao;

import com.example.security.entity.TToken;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TToken)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public interface TTokenDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TToken queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TToken> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tToken 实例对象
     * @return 对象列表
     */
    List<TToken> queryAll(TToken tToken);

    /**
     * 新增数据
     *
     * @param tToken 实例对象
     * @return 影响行数
     */
    int insert(TToken tToken);

    /**
     * 修改数据
     *
     * @param tToken 实例对象
     * @return 影响行数
     */
    int update(TToken tToken);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}