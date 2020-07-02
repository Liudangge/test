package com.example.security.dao;

import com.example.security.entity.SysPermission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.security.Permission;
import java.util.List;

/**
 * (SysPermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */

public interface SysPermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPermission queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysPermission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    @Select("select distinct p.* from sys_permission p join sys_role_permission rp on p.id = rp.permissionId join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = #{userId}")
    List<Permission> permissionByUserId(Integer userId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysPermission 实例对象
     * @return 对象列表
     */
    List<SysPermission> queryAll(SysPermission sysPermission);

    /**
     * 新增数据
     *
     * @param sysPermission 实例对象
     * @return 影响行数
     */
    int insert(SysPermission sysPermission);

    /**
     * 修改数据
     *
     * @param sysPermission 实例对象
     * @return 影响行数
     */
    int update(SysPermission sysPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}