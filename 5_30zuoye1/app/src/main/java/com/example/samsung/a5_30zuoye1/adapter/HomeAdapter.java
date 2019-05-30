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
import com.example.samsung.a5_30zuoye1.bean.HomeBean;
import com.example.samsung.a5_30zuoye1.callback.MyOnClick;

import java.util.ArrayList;

/**
 * Created by samsung on 2019/5/30.
 */

public class HomeAdapter extends RecyclerView.Adapter {
    private ArrayList<HomeBean.ResultBean.ListBean> listBeans;
    private Context context;
    private MyOnClick myOnClick;

    public void setMyOnClick(MyOnClick myOnClick) {
        this.myOnClick = myOnClick;
    }

    public HomeAdapter(ArrayList<HomeBean.ResultBean.ListBean> listBeans, Context context) {
        this.listBeans = listBeans;
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
        } else if (viewType == 4) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item4, parent, false);
            viewHolder = new MyHolder4(inflate);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            MyHolder1 myHolder1 = (MyHolder1) holder;
            myHolder1.tv1.setText(listBeans.get(position).getTitle());
            Glide.with(context).load(listBeans.get(position).getFirstImg()).into(myHolder1.iv);
        } else if (itemViewType == 2) {
            MyHolder2 myHolder2 = (MyHolder2) holder;
            myHolder2.tv2.setText(listBeans.get(position).getTitle());
            Glide.with(context).load(listBeans.get(position).getFirstImg()).into(myHolder2.iv1);
            myHolder2.tv3.setText(listBeans.get(position).getTitle2());
            Glide.with(context).load(listBeans.get(position).getSecondImg()).into(myHolder2.iv2);
        } else if (itemViewType == 3) {
            MyHolder3 myHolder3 = (MyHolder3) holder;
            myHolder3.tv4.setText(listBeans.get(position).getTitle());
            Glide.with(context).load(listBeans.get(position).getFirstImg()).into(myHolder3.iv3);
        } else if (itemViewType == 4) {
            MyHolder4 myHolder4 = (MyHolder4) holder;
            myHolder4.tv5.setText(listBeans.get(position).getTitle());
            Glide.with(context).load(listBeans.get(position).getFirstImg()).into(myHolder4.iv4);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myOnClick!=null){
                    myOnClick.click(position);
                }
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        } else if (position == 1) {
            return 2;
        } else if (position == 2) {
            return 3;
        }
        return 4;
    }

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    public class MyHolder1 extends RecyclerView.ViewHolder {

        private TextView tv1;
        private ImageView iv;

        public MyHolder1(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv);
            tv1 = itemView.findViewById(R.id.tv1);
        }
    }

    public class MyHolder2 extends RecyclerView.ViewHolder {

        private ImageView iv1;
        private ImageView iv2;
        private TextView tv2;
        private TextView tv3;

        public MyHolder2(View itemView) {
            super(itemView);
            iv1 = itemView.findViewById(R.id.iv1);
            iv2 = itemView.findViewById(R.id.iv2);
            tv2 = itemView.findViewById(R.id.tv2);
            tv3 = itemView.findViewById(R.id.tv3);
        }
    }

    public class MyHolder3 extends RecyclerView.ViewHolder {

        private TextView tv4;
        private ImageView iv3;

        public MyHolder3(View itemView) {
            super(itemView);
            iv3 = itemView.findViewById(R.id.iv3);
            tv4 = itemView.findViewById(R.id.tv4);
        }
    }

    public class MyHolder4 extends RecyclerView.ViewHolder {
        private TextView tv5;
        private ImageView iv4;

        public MyHolder4(View itemView) {
            super(itemView);
            iv4 = itemView.findViewById(R.id.iv4);
            tv5 = itemView.findViewById(R.id.tv5);
        }
    }
}
