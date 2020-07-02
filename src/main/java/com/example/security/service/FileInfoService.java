package com.example.security.service;

import com.example.security.entity.FileInfo;
import java.util.List;

/**
 * (FileInfo)表服务接口
 *
 * @author makejava
 * @since 2020-07-01 10:41:10
 */
public interface FileInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FileInfo queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FileInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fileInfo 实例对象
     * @return 实例对象
     */
    FileInfo insert(FileInfo fileInfo);

    /**
     * 修改数据
     *
     * @param fileInfo 实例对象
     * @return 实例对象
     */
    FileInfo update(FileInfo fileInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}