package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TDict)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class TDict implements Serializable {
    private static final long serialVersionUID = -10059933140514773L;
    
    private Integer id;
    
    private String type;
    
    private String k;
    
    private String val;
    
    private Date createtime;
    
    private Date updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
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