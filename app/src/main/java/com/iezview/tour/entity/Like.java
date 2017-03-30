package com.iezview.tour.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/3/30.
 */

public class Like extends BmobObject {
    String id;
    String userid;//谁点的赞
    String linkId;//谁被点赞

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }
}
