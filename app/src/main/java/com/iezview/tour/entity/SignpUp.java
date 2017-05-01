package com.iezview.tour.entity;

import cn.bmob.v3.BmobObject;

/**
 * TODO: place enter class desc
 *
 * @author yangwenli
 * @time 2017/5/1.
 */
public class SignpUp extends BmobObject{
    String  name ;
    String zhizhi;
    String sex;
    String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhizhi() {
        return zhizhi;
    }

    public void setZhizhi(String zhizhi) {
        this.zhizhi = zhizhi;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SignpUp{" +
                "name='" + name + '\'' +
                ", zhizhi='" + zhizhi + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
