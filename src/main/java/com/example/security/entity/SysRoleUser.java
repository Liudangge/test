package com.example.security.entity;

import java.io.Serializable;

/**
 * (SysRoleUser)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class SysRoleUser implements Serializable {
    private static final long serialVersionUID = -33859287915578985L;
    
    private Integer userid;
    
    private Integer roleid;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

}