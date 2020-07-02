package com.example.security.controller;

import com.example.security.entity.TNotice;
import com.example.security.service.TNoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TNotice)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("tNotice")
public class TNoticeController {
    /**
     * 服务对象
     */
    @Resource
    private TNoticeService tNoticeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TNotice selectOne(Integer id) {
        return this.tNoticeService.queryById(id);
    }

}