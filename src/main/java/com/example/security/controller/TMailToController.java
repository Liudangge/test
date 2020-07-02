package com.example.security.controller;

import com.example.security.entity.TMailTo;
import com.example.security.service.TMailToService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TMailTo)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("tMailTo")
public class TMailToController {
    /**
     * 服务对象
     */
    @Resource
    private TMailToService tMailToService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TMailTo selectOne(Integer id) {
        return this.tMailToService.queryById(id);
    }

}