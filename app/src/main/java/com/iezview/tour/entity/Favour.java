package com.iezview.tour.entity;

/**
 * Created by Administrator on 2017/4/24.
 * 点赞实体类
 */
public class Favour {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Favour) {
            return ((Favour) obj).getName().equals(this.name);
        }
        return false;
    }
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return name;
    }
}
