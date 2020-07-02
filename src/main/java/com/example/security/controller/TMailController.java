package com.example.security.controller;

import com.example.security.entity.TMail;
import com.example.security.service.TMailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TMail)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("tMail")
public class TMailController {
    /**
     * 服务对象
     */
    @Resource
    private TMailService tMailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TMail selectOne(Integer id) {
        return this.tMailService.queryById(id);
    }

}