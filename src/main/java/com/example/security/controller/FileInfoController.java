package com.example.security.controller;

import com.example.security.entity.FileInfo;
import com.example.security.service.FileInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FileInfo)表控制层
 *
 * @author makejava
 * @since 2020-07-01 10:41:24
 */
@RestController
@RequestMapping("fileInfo")
public class FileInfoController {
    /**
     * 服务对象
     */
    @Resource
    private FileInfoService fileInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FileInfo selectOne(String id) {
        return this.fileInfoService.queryById(id);
    }

}