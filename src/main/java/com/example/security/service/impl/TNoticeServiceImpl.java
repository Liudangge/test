package com.example.security.service.impl;

import com.example.security.entity.TNotice;
import com.example.security.dao.TNoticeDao;
import com.example.security.service.TNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TNotice)表服务实现类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@Service("tNoticeService")
public class TNoticeServiceImpl implements TNoticeService {
    @Resource
    private TNoticeDao tNoticeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TNotice queryById(Integer id) {
        return this.tNoticeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TNotice> queryAllByLimit(int offset, int limit) {
        return this.tNoticeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tNotice 实例对象
     * @return 实例对象
     */
    @Override
    public TNotice insert(TNotice tNotice) {
        this.tNoticeDao.insert(tNotice);
        return tNotice;
    }

    /**
     * 修改数据
     *
     * @param tNotice 实例对象
     * @return 实例对象
     */
    @Override
    public TNotice update(TNotice tNotice) {
        this.tNoticeDao.update(tNotice);
        return this.queryById(tNotice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tNoticeDao.deleteById(id) > 0;
    }
}