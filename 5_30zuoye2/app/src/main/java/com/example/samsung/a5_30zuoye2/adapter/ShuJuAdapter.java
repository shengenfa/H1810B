package com.example.samsung.a5_30zuoye2.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.samsung.a5_30zuoye2.R;
import com.example.samsung.a5_30zuoye2.bean.SecondBean;
import com.example.samsung.a5_30zuoye2.bean.ShuJu;
import com.example.samsung.a5_30zuoye2.callback.MyOnClick;
import com.example.samsung.a5_30zuoye2.util.DbHelper;

import java.util.ArrayList;

/**
 * Created by samsung on 2019/5/30.
 */

public class ShuJuAdapter extends RecyclerView.Adapter<ShuJuAdapter.MyHolder> {
    private ArrayList<ShuJu> list;
    private Context context;

    public ShuJuAdapter(ArrayList<ShuJu> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item5, parent, false);
        MyHolder myHolder = new MyHolder(inflate);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tv.setText(list.get(position).getContent());
        Glide.with(context).load(list.get(position).getImg()).into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyHolder extends RecyclerView.ViewHolder {

        private TextView tv;
        private ImageView iv;

        public MyHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv5);
            tv = itemView.findViewById(R.id.tv7);
        }
    }
}
