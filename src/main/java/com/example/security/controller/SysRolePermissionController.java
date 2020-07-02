package com.example.security.controller;

import com.example.security.entity.SysRolePermission;
import com.example.security.service.SysRolePermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysRolePermission)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
@RestController
@RequestMapping("sysRolePermission")
public class SysRolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private SysRolePermissionService sysRolePermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRolePermission selectOne(Integer id) {
        return this.sysRolePermissionService.queryById(id);
    }

}