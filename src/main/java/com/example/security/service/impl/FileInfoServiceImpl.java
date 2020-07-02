package com.example.security.service.impl;

import com.example.security.entity.FileInfo;
import com.example.security.dao.FileInfoDao;
import com.example.security.service.FileInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FileInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-07-01 10:41:11
 */
@Service("fileInfoService")
public class FileInfoServiceImpl implements FileInfoService {
    @Resource
    private FileInfoDao fileInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FileInfo queryById(String id) {
        return this.fileInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<FileInfo> queryAllByLimit(int offset, int limit) {
        return this.fileInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fileInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FileInfo insert(FileInfo fileInfo) {
        this.fileInfoDao.insert(fileInfo);
        return fileInfo;
    }

    /**
     * 修改数据
     *
     * @param fileInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FileInfo update(FileInfo fileInfo) {
        this.fileInfoDao.update(fileInfo);
        return this.queryById(fileInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.fileInfoDao.deleteById(id) > 0;
    }
}