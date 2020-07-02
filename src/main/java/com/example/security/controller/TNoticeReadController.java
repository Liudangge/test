package com.example.security.controller;

import com.example.security.entity.TNoticeRead;
import com.example.security.service.TNoticeReadService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TNoticeRead)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("tNoticeRead")
public class TNoticeReadController {
    /**
     * 服务对象
     */
    @Resource
    private TNoticeReadService tNoticeReadService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TNoticeRead selectOne(Integer id) {
        return this.tNoticeReadService.queryById(id);
    }

}