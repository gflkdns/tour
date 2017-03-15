package com.iezview.tour.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/3/15.
 * 学校
 */

public class School extends BmobObject {
    private String id;
    private String name;
    private String location;
    private String tuition;
    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
