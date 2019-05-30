package com.example.samsung.a5_30zuoye1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.samsung.a5_30zuoye1.adapter.MyFragAdapter;
import com.example.samsung.a5_30zuoye1.fragment.AttentionFragment;
import com.example.samsung.a5_30zuoye1.fragment.SchoolFragment;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private TabLayout mTab;
    private ViewPager mVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTab = findViewById(R.id.tab);
        mVp = findViewById(R.id.vp);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new SchoolFragment());
        fragments.add(new AttentionFragment());
        ArrayList<String> list = new ArrayList<>();
        list.add("校门");
        list.add("关注");
        MyFragAdapter myFragAdapter = new MyFragAdapter(getSupportFragmentManager(), fragments, list);
        mVp.setAdapter(myFragAdapter);
        mTab.setupWithViewPager(mVp);
    }
}
