package com.example.security.service;

import com.example.security.entity.TNoticeRead;
import java.util.List;

/**
 * (TNoticeRead)表服务接口
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public interface TNoticeReadService {

    /**
     * 通过ID查询单条数据
     *
     * @param noticeid 主键
     * @return 实例对象
     */
    TNoticeRead queryById(Integer noticeid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TNoticeRead> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tNoticeRead 实例对象
     * @return 实例对象
     */
    TNoticeRead insert(TNoticeRead tNoticeRead);

    /**
     * 修改数据
     *
     * @param tNoticeRead 实例对象
     * @return 实例对象
     */
    TNoticeRead update(TNoticeRead tNoticeRead);

    /**
     * 通过主键删除数据
     *
     * @param noticeid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer noticeid);

}