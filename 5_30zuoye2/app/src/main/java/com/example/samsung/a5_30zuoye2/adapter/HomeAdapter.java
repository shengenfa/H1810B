package com.example.samsung.a5_30zuoye2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.samsung.a5_30zuoye2.R;
import com.example.samsung.a5_30zuoye2.bean.Home;
import com.example.samsung.a5_30zuoye2.callback.MyOnClick;

import java.util.ArrayList;

/**
 * Created by samsung on 2019/5/30.
 */

public class HomeAdapter extends RecyclerView.Adapter {
    private ArrayList<Home.ResultBean.DataBean> list;
    private Context context;
    private MyOnClick myOnClick;

    public void setMyOnClick(MyOnClick myOnClick) {
        this.myOnClick = myOnClick;
    }

    public HomeAdapter(ArrayList<Home.ResultBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        if (viewType == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item1, parent, false);
            viewHolder = new MyHolder1(inflate);
        } else if (viewType == 2) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item2, parent, false);
            viewHolder = new MyHolder2(inflate);
        } else if (viewType == 3) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item3, parent, false);
            viewHolder = new MyHolder3(inflate);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            MyHolder1 myHolder1 = (MyHolder1) holder;
            myHolder1.tv.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getUrl1()).into(myHolder1.iv);
        } else if (itemViewType == 2) {
            MyHolder2 myHolder2 = (MyHolder2) holder;
            myHolder2.tv1.setText(list.get(position).getContent());
            myHolder2.tv2.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getUrl1()).into(myHolder2.iv1);
            Glide.with(context).load(list.get(position).getUrl2()).into(myHolder2.iv2);
        } else if (itemViewType == 3) {
            MyHolder3 myHolder3 = (MyHolder3) holder;
            myHolder3.tv3.setText(list.get(position).getContent());
            myHolder3.tv4.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getUrl1()).apply(RequestOptions.circleCropTransform()).into(myHolder3.iv3);
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
        if (position == 4) {
            return 1;
        } else if (position == 5) {
            return 2;
        }
        return 3;
    }

    class MyHolder1 extends RecyclerView.ViewHolder {

        private ImageView iv;
        private TextView tv;

        public MyHolder1(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);
        }
    }

    class MyHolder2 extends RecyclerView.ViewHolder {

        private ImageView iv1;
        private TextView tv1;
        private ImageView iv2;
        private TextView tv2;

        public MyHolder2(View itemView) {
            super(itemView);
            iv1 = itemView.findViewById(R.id.iv1);
            tv1 = itemView.findViewById(R.id.tv1);
            iv2 = itemView.findViewById(R.id.iv2);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }

    class MyHolder3 extends RecyclerView.ViewHolder {

        private ImageView iv3;
        private TextView tv3;
        private TextView tv4;

        public MyHolder3(View itemView) {
            super(itemView);
            iv3 = itemView.findViewById(R.id.iv3);
            tv3 = itemView.findViewById(R.id.tv3);
            tv4 = itemView.findViewById(R.id.tv4);
        }
    }
}
