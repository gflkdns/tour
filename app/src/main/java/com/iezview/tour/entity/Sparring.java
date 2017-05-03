package com.iezview.tour.entity;

import java.util.List;

import cn.bmob.v3.BmobObject;

/**
 * 陪练
 */

public class Sparring extends BmobObject {
    private String id;
    private String name;
    private String sex;
    private String age;
    private String desc;
    private String image;
    private List<Comment> comments;

    public List<Favour> getFavours() {
        return favours;
    }

    public void setFavours(List<Favour> favours) {
        this.favours = favours;
    }

    private List<Favour> favours;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
