package com.example.security.controller;

import com.example.security.entity.TDict;
import com.example.security.service.TDictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TDict)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("tDict")
public class TDictController {
    /**
     * 服务对象
     */
    @Resource
    private TDictService tDictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TDict selectOne(Integer id) {
        return this.tDictService.queryById(id);
    }

}