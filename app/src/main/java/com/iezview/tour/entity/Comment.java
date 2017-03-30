package com.iezview.tour.entity;

import cn.bmob.v3.BmobObject;

/**
 * 评论
 */

public class Comment extends BmobObject {
    String context;
    String linkId;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }
}
