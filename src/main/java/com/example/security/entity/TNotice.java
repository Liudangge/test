package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TNotice)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class TNotice implements Serializable {
    private static final long serialVersionUID = -27913769538372073L;
    
    private Integer id;
    
    private String title;
    
    private String content;
    
    private Object status;
    
    private Date createtime;
    
    private Date updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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