package com.example.security.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (FileInfo)实体类
 *
 * @author makejava
 * @since 2020-07-01 10:41:07
 */
public class FileInfo implements Serializable {
    private static final long serialVersionUID = -26594735097284271L;
    /**
    * 文件md5
    */
    private String id;
    
    private String contenttype;
    
    private Integer size;
    /**
    * 物理路径
    */
    private String path;
    
    private String url;
    
    private Integer type;
    
    private Date createtime;
    
    private Date updatetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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