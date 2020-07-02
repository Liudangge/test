package com.example.security.service.impl;

import com.example.security.entity.TNoticeRead;
import com.example.security.dao.TNoticeReadDao;
import com.example.security.service.TNoticeReadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TNoticeRead)表服务实现类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@Service("tNoticeReadService")
public class TNoticeReadServiceImpl implements TNoticeReadService {
    @Resource
    private TNoticeReadDao tNoticeReadDao;

    /**
     * 通过ID查询单条数据
     *
     * @param noticeid 主键
     * @return 实例对象
     */
    @Override
    public TNoticeRead queryById(Integer noticeid) {
        return this.tNoticeReadDao.queryById(noticeid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TNoticeRead> queryAllByLimit(int offset, int limit) {
        return this.tNoticeReadDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tNoticeRead 实例对象
     * @return 实例对象
     */
    @Override
    public TNoticeRead insert(TNoticeRead tNoticeRead) {
        this.tNoticeReadDao.insert(tNoticeRead);
        return tNoticeRead;
    }

    /**
     * 修改数据
     *
     * @param tNoticeRead 实例对象
     * @return 实例对象
     */
    @Override
    public TNoticeRead update(TNoticeRead tNoticeRead) {
        this.tNoticeReadDao.update(tNoticeRead);
        return this.queryById(tNoticeRead.getNoticeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param noticeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer noticeid) {
        return this.tNoticeReadDao.deleteById(noticeid) > 0;
    }
}