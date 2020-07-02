package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TJob)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:44:41
 */
public class TJob implements Serializable {
    private static final long serialVersionUID = -70618158026360813L;
    
    private Integer id;
    
    private String jobname;
    
    private String description;
    
    private String cron;
    /**
    * springBean名
    */
    private String springbeanname;
    /**
    * 方法名
    */
    private String methodname;
    /**
    * 是否是系统job
    */
    private Object issysjob;
    
    private Object status;
    
    private Date createtime;
    
    private Date updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getSpringbeanname() {
        return springbeanname;
    }

    public void setSpringbeanname(String springbeanname) {
        this.springbeanname = springbeanname;
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname;
    }

    public Object getIssysjob() {
        return issysjob;
    }

    public void setIssysjob(Object issysjob) {
        this.issysjob = issysjob;
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