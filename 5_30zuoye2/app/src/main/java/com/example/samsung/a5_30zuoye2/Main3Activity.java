package com.example.samsung.a5_30zuoye2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.samsung.a5_30zuoye2.adapter.ShuJuAdapter;
import com.example.samsung.a5_30zuoye2.bean.ShuJu;
import com.example.samsung.a5_30zuoye2.util.DbHelper;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView mRv2;
    private ArrayList<ShuJu> shuJus;
    private ShuJuAdapter shuJuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mRv2 = findViewById(R.id.rv2);
        mRv2.setLayoutManager(new LinearLayoutManager(this));
        shuJus = new ArrayList<>();
        shuJuAdapter = new ShuJuAdapter(shuJus, this);
        mRv2.setAdapter(shuJuAdapter);
        initData();
    }

    private void initData() {
        List<ShuJu> query = DbHelper.getDbHelper().query();
        shuJus.addAll(query);
        shuJuAdapter.notifyDataSetChanged();
    }
}
