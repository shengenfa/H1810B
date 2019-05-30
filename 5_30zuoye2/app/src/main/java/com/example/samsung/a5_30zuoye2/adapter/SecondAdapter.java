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
import com.example.samsung.a5_30zuoye2.bean.Home;
import com.example.samsung.a5_30zuoye2.bean.SecondBean;
import com.example.samsung.a5_30zuoye2.bean.ShuJu;
import com.example.samsung.a5_30zuoye2.callback.MyOnClick;
import com.example.samsung.a5_30zuoye2.util.DbHelper;

import java.util.ArrayList;

/**
 * Created by samsung on 2019/5/30.
 */

public class SecondAdapter extends RecyclerView.Adapter {
    private ArrayList<SecondBean.ResultBean.DataBean> list;
    private Context context;
    private MyOnClick myOnClick;

    public void setMyOnClick(MyOnClick myOnClick) {
        this.myOnClick = myOnClick;
    }

    public SecondAdapter(ArrayList<SecondBean.ResultBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        if (viewType == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item3, parent, false);
            viewHolder = new MyHolder6(inflate);
        } else if (viewType == 2) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item4, parent, false);
            viewHolder = new MyHolder1(inflate);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            MyHolder6 myHolder3 = (MyHolder6) holder;
            myHolder3.tv3.setText(list.get(position).getContent());
            myHolder3.tv4.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getUrl()).into(myHolder3.iv3);
        } else if (itemViewType == 2) {
            MyHolder1 myHolder1 = (MyHolder1) holder;
            myHolder1.tv5.setText(list.get(position).getContent());
            myHolder1.tv6.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getUrl()).into(myHolder1.iv4);
            myHolder1.btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new AlertDialog.Builder(context).setTitle("是否添加到数据库")
                            .setPositiveButton("取消",null)
                            .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    ShuJu shuJu = new ShuJu();
                                    SecondBean.ResultBean.DataBean dataBean = list.get(position);
                                    shuJu.setImg(dataBean.getUrl());
                                    shuJu.setContent(dataBean.getContent());
                                    DbHelper.getDbHelper().add(shuJu);
                                }
                            }).show();
                }
            });
        }
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

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        }
        return 2;
    }

    class MyHolder1 extends RecyclerView.ViewHolder {

        private ImageView iv4;
        private TextView tv5;
        private TextView tv6;
        private Button btn;

        public MyHolder1(View itemView) {
            super(itemView);
            iv4 = itemView.findViewById(R.id.iv4);
            tv5 = itemView.findViewById(R.id.tv5);
            tv6 = itemView.findViewById(R.id.tv6);
            btn = itemView.findViewById(R.id.btn);
        }
    }

    class MyHolder6 extends RecyclerView.ViewHolder {

        private ImageView iv3;
        private TextView tv3;
        private TextView tv4;

        public MyHolder6(View itemView) {
            super(itemView);
            iv3 = itemView.findViewById(R.id.iv3);
            tv3 = itemView.findViewById(R.id.tv3);
            tv4 = itemView.findViewById(R.id.tv4);
        }
    }
}
