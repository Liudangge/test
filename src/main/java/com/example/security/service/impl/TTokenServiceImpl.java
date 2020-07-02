package com.example.security.service.impl;

import com.example.security.entity.TToken;
import com.example.security.dao.TTokenDao;
import com.example.security.service.TTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TToken)表服务实现类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@Service("tTokenService")
public class TTokenServiceImpl implements TTokenService {
    @Resource
    private TTokenDao tTokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TToken queryById(String id) {
        return this.tTokenDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TToken> queryAllByLimit(int offset, int limit) {
        return this.tTokenDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tToken 实例对象
     * @return 实例对象
     */
    @Override
    public TToken insert(TToken tToken) {
        this.tTokenDao.insert(tToken);
        return tToken;
    }

    /**
     * 修改数据
     *
     * @param tToken 实例对象
     * @return 实例对象
     */
    @Override
    public TToken update(TToken tToken) {
        this.tTokenDao.update(tToken);
        return this.queryById(tToken.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tTokenDao.deleteById(id) > 0;
    }
}