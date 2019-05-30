package com.example.samsung.a5_30zuoye2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.samsung.a5_30zuoye2.adapter.SecondAdapter;
import com.example.samsung.a5_30zuoye2.bean.SecondBean;
import com.example.samsung.a5_30zuoye2.callback.MyOnClick;
import com.example.samsung.a5_30zuoye2.model.ImpSecondModel;
import com.example.samsung.a5_30zuoye2.presenter.ImpSecondPresenter;
import com.example.samsung.a5_30zuoye2.view.SecondView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements SecondView {

    private RecyclerView mRv1;
    private ArrayList<SecondBean.ResultBean.DataBean> dataBeans;
    private SecondAdapter secondAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initData();
        mRv1 = findViewById(R.id.rv1);
        mRv1.setLayoutManager(new LinearLayoutManager(this));
        dataBeans = new ArrayList<>();
        secondAdapter = new SecondAdapter(dataBeans, this);
        mRv1.setAdapter(secondAdapter);
    }

    private void initData() {
        ImpSecondPresenter impSecondPresenter = new ImpSecondPresenter(new ImpSecondModel(), this);
        impSecondPresenter.getData();
    }

    @Override
    public void onSuccess(List<SecondBean.ResultBean.DataBean> dataBeanList) {
        dataBeans.addAll(dataBeanList);
        secondAdapter.notifyDataSetChanged();
        secondAdapter.setMyOnClick(new MyOnClick() {
            @Override
            public void click(int i) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
