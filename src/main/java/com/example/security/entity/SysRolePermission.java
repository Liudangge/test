package com.example.security.entity;

import java.io.Serializable;

/**
 * (SysRolePermission)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class SysRolePermission implements Serializable {
    private static final long serialVersionUID = -66165579071529657L;
    
    private Integer roleid;
    
    private Integer permissionid;


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

}