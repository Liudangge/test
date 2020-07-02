package com.example.security.dao;

import com.example.security.entity.TDict;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TDict)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public interface TDictDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TDict queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TDict> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tDict 实例对象
     * @return 对象列表
     */
    List<TDict> queryAll(TDict tDict);

    /**
     * 新增数据
     *
     * @param tDict 实例对象
     * @return 影响行数
     */
    int insert(TDict tDict);

    /**
     * 修改数据
     *
     * @param tDict 实例对象
     * @return 影响行数
     */
    int update(TDict tDict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}