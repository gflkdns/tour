package com.iezview.tour.entity;

/**
 * Created by Administrator on 2017/3/16.
 * otto总线通信消息实体
 */

public class OttoMessage {
    /**
     * 消息类型
     */
    private int type;
    /**
     * 消息内容
     */
    private Object obj;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "OttoMessage{" +
                "type=" + type +
                ", obj=" + obj +
                '}';
    }
}
