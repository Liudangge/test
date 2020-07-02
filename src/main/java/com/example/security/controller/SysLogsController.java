package com.example.security.controller;

import com.example.security.entity.SysLogs;
import com.example.security.service.SysLogsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysLogs)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("sysLogs")
public class SysLogsController {
    /**
     * 服务对象
     */
    @Resource
    private SysLogsService sysLogsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLogs selectOne(Integer id) {
        return this.sysLogsService.queryById(id);
    }

}