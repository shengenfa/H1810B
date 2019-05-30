package com.example.samsung.a5_30zuoye2.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.samsung.a5_30zuoye2.Main2Activity;
import com.example.samsung.a5_30zuoye2.R;
import com.example.samsung.a5_30zuoye2.adapter.HomeAdapter;
import com.example.samsung.a5_30zuoye2.bean.Home;
import com.example.samsung.a5_30zuoye2.callback.MyOnClick;
import com.example.samsung.a5_30zuoye2.model.ImpHomeModel;
import com.example.samsung.a5_30zuoye2.presenter.ImpHomePresenter;

import java.util.ArrayList;
import java.util.List;

//申根发 H1810B
public class MainActivity extends AppCompatActivity implements HomeView {

    private RecyclerView mRv;
    private ArrayList<Home.ResultBean.DataBean> dataBeans;
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        mRv = findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        dataBeans = new ArrayList<>();
        homeAdapter = new HomeAdapter(dataBeans, this);
        mRv.setAdapter(homeAdapter);
    }

    private void initData() {
        ImpHomePresenter impHomePresenter = new ImpHomePresenter(new ImpHomeModel(), this);
        impHomePresenter.getData();
    }

    @Override
    public void onSuccess(List<Home.ResultBean.DataBean> dataBeanList) {
        dataBeans.addAll(dataBeanList);
        homeAdapter.notifyDataSetChanged();
        homeAdapter.setMyOnClick(new MyOnClick() {
            @Override
            public void click(int i) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
