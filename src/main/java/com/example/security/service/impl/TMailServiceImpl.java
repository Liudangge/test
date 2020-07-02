package com.example.security.service.impl;

import com.example.security.entity.TMail;
import com.example.security.dao.TMailDao;
import com.example.security.service.TMailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TMail)表服务实现类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@Service("tMailService")
public class TMailServiceImpl implements TMailService {
    @Resource
    private TMailDao tMailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TMail queryById(Integer id) {
        return this.tMailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TMail> queryAllByLimit(int offset, int limit) {
        return this.tMailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tMail 实例对象
     * @return 实例对象
     */
    @Override
    public TMail insert(TMail tMail) {
        this.tMailDao.insert(tMail);
        return tMail;
    }

    /**
     * 修改数据
     *
     * @param tMail 实例对象
     * @return 实例对象
     */
    @Override
    public TMail update(TMail tMail) {
        this.tMailDao.update(tMail);
        return this.queryById(tMail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tMailDao.deleteById(id) > 0;
    }
}