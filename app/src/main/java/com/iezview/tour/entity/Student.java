package com.iezview.tour.entity;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

/**
 * Created by Administrator on 2017/3/15.
 */

public class Student extends BmobUser {
    private String id;//学生id
    private String schoolId;//学校id
    private String coachId;//教練id
    private String sparringId;//陪练id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getSparringId() {
        return sparringId;
    }

    public void setSparringId(String sparringId) {
        this.sparringId = sparringId;
    }
}
