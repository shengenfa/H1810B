package com.example.samsung.xiaoshixunqizhong.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.samsung.xiaoshixunqizhong.R;
import com.example.samsung.xiaoshixunqizhong.adapter.MyFragAdapter;
import com.example.samsung.xiaoshixunqizhong.fragment.HomeFragment;
import com.example.samsung.xiaoshixunqizhong.fragment.ReMenFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTab;
    private ViewPager mVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTab = findViewById(R.id.tab);
        mVp = findViewById(R.id.vp);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new ReMenFragment());
        ArrayList<String> list = new ArrayList<>();
        list.add("校门");
        list.add("关注");
        MyFragAdapter myFragAdapter = new MyFragAdapter(getSupportFragmentManager(), fragments, list);
        mVp.setAdapter(myFragAdapter);
        mTab.setupWithViewPager(mVp);
    }
}
