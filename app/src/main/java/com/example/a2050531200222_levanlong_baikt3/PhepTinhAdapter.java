package com.example.a2050531200222_levanlong_baikt3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhepTinhAdapter extends BaseAdapter {
    Activity activity;
    List<PhepTinh> phepTinhs;

    public PhepTinhAdapter(Activity activity, List<PhepTinh> phepTinhs) {
        this.activity = activity;
        this.phepTinhs = phepTinhs;
    }

    @Override
    public int getCount() {
        return phepTinhs.size();
    }

    @Override
    public Object getItem(int i) {
        return phepTinhs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

        // Đổ dữ liệu vào biến View, view này chính là những gì nằm trong item_name.xml
        view = inflater.inflate(R.layout.itempheptinh, null);

        // Đặt chữ cho từng view trong danh sách.
        TextView tvName = (TextView) view.findViewById(R.id.tvPhepTinh);
        ImageView img = (ImageView)view.findViewById(R.id.iconPhepTinh);
        tvName.setText(phepTinhs.get(i).getTenPhepTinh());
        img.setImageResource(phepTinhs.get(i).getIcon());
        // Trả về view kết quả.
        return view;
    }
}
