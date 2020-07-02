package com.example.security.entity;

import java.io.Serializable;

/**
 * (TMailTo)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class TMailTo implements Serializable {
    private static final long serialVersionUID = -65610344951954313L;
    
    private Integer id;
    
    private Integer mailid;
    
    private String touser;
    /**
    * 1成功，0失败
    */
    private Object status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMailid() {
        return mailid;
    }

    public void setMailid(Integer mailid) {
        this.mailid = mailid;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

}