package com.example.samsung.a5_30zuoye1.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.samsung.a5_30zuoye1.R;
import com.example.samsung.a5_30zuoye1.bean.Attention;
import com.example.samsung.a5_30zuoye1.callback.MyOnClick;

import java.util.ArrayList;

/**
 * Created by samsung on 2019/5/30.
 */

public class AttentionAdapter extends RecyclerView.Adapter<AttentionAdapter.MyHolder> {
    private ArrayList<Attention.ResultBean.DataBean> list;
    private Context context;
    private MyOnClick myOnClick;

    public void setMyOnClick(MyOnClick myOnClick) {
        this.myOnClick = myOnClick;
    }

    public AttentionAdapter(ArrayList<Attention.ResultBean.DataBean> list, Context context) {
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
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        holder.tv.setText(list.get(position).getTitle());
        Glide.with(context).load(list.get(position).getThumbnail_pic_s03()).into(holder.iv);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myOnClick != null) {
                    myOnClick.click(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private ImageView iv;
        private TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv5);
            tv = itemView.findViewById(R.id.tv6);
        }
    }
}
