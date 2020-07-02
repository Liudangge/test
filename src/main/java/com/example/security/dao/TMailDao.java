package com.example.security.dao;

import com.example.security.entity.TMail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TMail)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public interface TMailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TMail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tMail 实例对象
     * @return 对象列表
     */
    List<TMail> queryAll(TMail tMail);

    /**
     * 新增数据
     *
     * @param tMail 实例对象
     * @return 影响行数
     */
    int insert(TMail tMail);

    /**
     * 修改数据
     *
     * @param tMail 实例对象
     * @return 影响行数
     */
    int update(TMail tMail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}