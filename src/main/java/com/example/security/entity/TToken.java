package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TToken)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class TToken implements Serializable {
    private static final long serialVersionUID = -54661283094559196L;
    /**
    * token
    */
    private String id;
    /**
    * LoginUser的json串
    */
    private String val;
    
    private Date expiretime;
    
    private Date createtime;
    
    private Date updatetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

}