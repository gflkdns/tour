package com.iezview.tour.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.iezview.tour.activity.CoachListActivity;
import com.iezview.tour.entity.Coach;
import com.tour.ydt.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * 教练适配器
 */

public class CoachAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater mLayoutInflater;
    private List<Coach> coaches;

    public CoachAdapter(Context context, List<Coach> coaches) {
        this.context = context;
        this.coaches = coaches;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return coaches.size();
    }

    @Override
    public Object getItem(int i) {
        return coaches.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoulder viewHoulder = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item_coach, parent, false);
            viewHoulder = new ViewHoulder(convertView);
            convertView.setTag(viewHoulder);
        } else {
            viewHoulder = (ViewHoulder) convertView.getTag();
        }
        Coach coach = coaches.get(position);
        viewHoulder.tv_age.setText("年龄：" + coach.getAge());
        viewHoulder.tv_name.setText("姓名：" + coach.getName());
        viewHoulder.tv_desc.setText(coach.getIntroduce());
        viewHoulder.tv_sex.setText("性别：" + coach.getSex());
        return convertView;
    }

    private class ViewHoulder {
        @ViewInject(R.id.tv_age)
        TextView tv_age;
        @ViewInject(R.id.tv_desc)
        TextView tv_desc;
        @ViewInject(R.id.tv_sex)
        TextView tv_sex;
        @ViewInject(R.id.tv_name)
        TextView tv_name;

        public ViewHoulder(View v) {
            x.view().inject(this, v);
        }
    }
}
