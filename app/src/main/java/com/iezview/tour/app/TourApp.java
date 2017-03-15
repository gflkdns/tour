package com.iezview.tour.app;

import android.app.Application;
import android.util.Log;

import com.iezview.tour.entity.Coach;
import com.iezview.tour.entity.School;
import com.iezview.tour.entity.Sparring;

import org.xutils.x;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by IEZ on 2016/11/1.
 */

public class TourApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        // 初始化  SDK
        Bmob.initialize(this, "c1c33cab990cdba551b1fdd60aa66e59");
        //  initData();
    }

    /**
     * 往后台数据库里面输入一部分假数据
     */
    private void initData() {
        //10个教练10个学校10个陪练
        for (int i = 0; i < 10; i++) {
            //---------------------------------------------------------------------------------------
            Coach coach = new Coach();
            coach.setName("史密斯");
            coach.setAge("35");
            coach.setIntroduce("他为人耿直，热心肠，本着“只有教不好的老师，没有教不会的学生”" +
                    "的严格的教学理念，对学员极度负责，针对学员不同的情况因材施教，进行人性化教学" +
                    "，通过理论与实践相结合的教学方式把许多驾驶过程中遇到的情况言传身教。相信是您" +
                    "选择教练的最佳选择。");
            coach.setSex("男");
            coach.setId(String.valueOf(i));
            coach.save(new SaveListener<String>() {
                @Override
                public void done(String s, BmobException e) {
                    Log.d("infosds", s);
                }
            });
            //---------------------------------------------------------------------------------------
            School school = new School();
            school.setId(String.valueOf(i));
            school.setName("海淀驾校");
            school.setDesc("海淀驾校实标包括：北京市海淀区汽车驾驶学校、北京市京海机动车驾驶员考试场、" +
                    "北京市海淀摩托学校、北京市海驾汽车俱乐部和海驾餐厅五个单位，一个法人代表实行统一" +
                    "领导；海淀驾校位于颐和园西北10公里，全校现有教职员工800余人，各种型号教练车450辆，" +
                    "拥有近6000平方米办公大楼，建有占地3000余亩的训练场地，各种训练道路近50公里。新改建近6" +
                    "万平方米的综合练杆场，训练场可容纳1660教练车同时训练。另有接送学员班车50余辆，每天" +
                    "有150辆次分9个时间段免费接送学员。海淀驾校每年培训毕业合格驾驶员近2万名。");
            school.setLocation("北京");
            school.setTuition("5000¥");
            school.save(new SaveListener<String>() {
                @Override
                public void done(String s, BmobException e) {
                    Log.d("infosds", s);
                }
            });
            //---------------------------------------------------------------------------------------
            Sparring sparring = new Sparring();
            sparring.setId(String.valueOf(i));
            sparring.setDesc("工作认真,态度很好，驾车经验丰富，教学经验丰富,北京路况熟,乐于助人!");
            sparring.setName("赵萌");
            sparring.setAge("34");
            sparring.setSex("女");
            sparring.setImage("http://www.qqpk.cn/Article/UploadFiles/201203/20120301135846759.jpg");
            sparring.save(new SaveListener<String>() {
                @Override
                public void done(String s, BmobException e) {
                    Log.d("infosds", s);
                }
            });
        }
    }
}
