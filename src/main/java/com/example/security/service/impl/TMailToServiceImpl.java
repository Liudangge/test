package com.example.security.service.impl;

import com.example.security.entity.TMailTo;
import com.example.security.dao.TMailToDao;
import com.example.security.service.TMailToService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TMailTo)表服务实现类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@Service("tMailToService")
public class TMailToServiceImpl implements TMailToService {
    @Resource
    private TMailToDao tMailToDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TMailTo queryById(Integer id) {
        return this.tMailToDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TMailTo> queryAllByLimit(int offset, int limit) {
        return this.tMailToDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tMailTo 实例对象
     * @return 实例对象
     */
    @Override
    public TMailTo insert(TMailTo tMailTo) {
        this.tMailToDao.insert(tMailTo);
        return tMailTo;
    }

    /**
     * 修改数据
     *
     * @param tMailTo 实例对象
     * @return 实例对象
     */
    @Override
    public TMailTo update(TMailTo tMailTo) {
        this.tMailToDao.update(tMailTo);
        return this.queryById(tMailTo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tMailToDao.deleteById(id) > 0;
    }
}