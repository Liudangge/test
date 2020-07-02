package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TNoticeRead)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class TNoticeRead implements Serializable {
    private static final long serialVersionUID = 399696401998238658L;
    
    private Integer noticeid;
    
    private Integer userid;
    
    private Date createtime;


    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}