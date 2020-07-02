package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TMail)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class TMail implements Serializable {
    private static final long serialVersionUID = -54325251602405472L;
    
    private Integer id;
    /**
    * 发送人
    */
    private Integer userid;
    /**
    * 标题
    */
    private String subject;
    /**
    * 正文
    */
    private Object content;
    
    private Date createtime;
    
    private Date updatetime;


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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
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