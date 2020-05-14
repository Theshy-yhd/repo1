package com.atguigu.pojo;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-18:14
 */
public class file {

    private Integer id;
    private String filename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "file{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                '}';
    }
}
