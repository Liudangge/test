package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysLogs)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class SysLogs implements Serializable {
    private static final long serialVersionUID = 597442272808083661L;
    
    private Integer id;
    
    private Integer userid;
    /**
    * 模块名
    */
    private String module;
    /**
    * 成功失败
    */
    private Object flag;
    /**
    * 备注
    */
    private String remark;
    
    private Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Object getFlag() {
        return flag;
    }

    public void setFlag(Object flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}