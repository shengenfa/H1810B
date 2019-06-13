package com.example.samsung.xiaoshixunqizhong.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.samsung.xiaoshixunqizhong.R;
import com.example.samsung.xiaoshixunqizhong.bean.Home;

import java.util.ArrayList;

import retrofit2.http.POST;

/**
 * Created by samsung on 2019/6/13.
 */

public class HomeAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<Home> list;

    public HomeAdapter(Context context, ArrayList<Home> list) {
        this.context = context;
        this.list = list;
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
            myHolder1.item1_tv.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getImg()).into(myHolder1.item1_iv);
        } else if (itemViewType == 2) {
            MyHolder2 myHolder2 = (MyHolder2) holder;
            myHolder2.item2_tv.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getImg()).into(myHolder2.item2_iv1);
            Glide.with(context).load(list.get(position).getImg()).into(myHolder2.item2_iv2);
        } else if (itemViewType == 3) {
            MyHolder3 myHolder3 = (MyHolder3) holder;
            myHolder3.item3_tv.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getImg()).into(myHolder3.item3_iv);
        } else if (itemViewType == 4) {
            MyHolder4 myHolder4 = (MyHolder4) holder;
            myHolder4.item4_tv.setText(list.get(position).getContent());
            Glide.with(context).load(list.get(position).getImg()).into(myHolder4.item4_iv);
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
        if (position % 4 == 0) {
            return 1;
        } else if (position % 4 == 1) {
            return 2;
        } else if (position % 4 == 2) {
            return 3;
        }
        return 4;
    }

    class MyHolder1 extends RecyclerView.ViewHolder {

        private final ImageView item1_iv;
        private final TextView item1_tv;

        public MyHolder1(View itemView) {
            super(itemView);
            item1_iv = itemView.findViewById(R.id.item1_iv);
            item1_tv = itemView.findViewById(R.id.item1_tv);
        }
    }

    class MyHolder2 extends RecyclerView.ViewHolder {

        private final ImageView item2_iv1;
        private final ImageView item2_iv2;
        private final TextView item2_tv;

        public MyHolder2(View itemView) {
            super(itemView);
            item2_iv1 = itemView.findViewById(R.id.item2_iv1);
            item2_iv2 = itemView.findViewById(R.id.item2_iv2);
            item2_tv = itemView.findViewById(R.id.item2_tv);
        }
    }

    class MyHolder3 extends RecyclerView.ViewHolder {

        private final ImageView item3_iv;
        private final TextView item3_tv;

        public MyHolder3(View itemView) {
            super(itemView);
            item3_iv = itemView.findViewById(R.id.item3_iv);
            item3_tv = itemView.findViewById(R.id.item3_tv);
        }
    }

    class MyHolder4 extends RecyclerView.ViewHolder {

        private final TextView item4_tv;
        private final ImageView item4_iv;

        public MyHolder4(View itemView) {
            super(itemView);
            item4_iv = itemView.findViewById(R.id.item4_iv);
            item4_tv = itemView.findViewById(R.id.item4_tv);
        }
    }

    public interface MyOnClick {
        void click(int i);
    }

    private MyOnClick myOnClick;

    public void setMyOnClick(MyOnClick myOnClick) {
        this.myOnClick = myOnClick;
    }
}
