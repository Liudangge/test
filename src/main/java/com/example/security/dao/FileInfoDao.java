package com.example.security.dao;

import com.example.security.entity.FileInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (FileInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-01 10:41:08
 */
public interface FileInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FileInfo queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FileInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fileInfo 实例对象
     * @return 对象列表
     */
    List<FileInfo> queryAll(FileInfo fileInfo);

    /**
     * 新增数据
     *
     * @param fileInfo 实例对象
     * @return 影响行数
     */
    int insert(FileInfo fileInfo);

    /**
     * 修改数据
     *
     * @param fileInfo 实例对象
     * @return 影响行数
     */
    int update(FileInfo fileInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}