package com.example.security.controller;

import com.example.security.entity.TJob;
import com.example.security.service.TJobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TJob)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("tJob")
public class TJobController {
    /**
     * 服务对象
     */
    @Resource
    private TJobService tJobService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TJob selectOne(Integer id) {
        return this.tJobService.queryById(id);
    }

}