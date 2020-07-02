package com.example.security.controller;

import com.example.security.entity.TToken;
import com.example.security.service.TTokenService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TToken)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("tToken")
public class TTokenController {
    /**
     * 服务对象
     */
    @Resource
    private TTokenService tTokenService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TToken selectOne(String id) {
        return this.tTokenService.queryById(id);
    }

}