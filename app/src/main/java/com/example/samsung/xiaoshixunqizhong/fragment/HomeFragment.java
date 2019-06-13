package com.example.samsung.xiaoshixunqizhong.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.samsung.xiaoshixunqizhong.R;
import com.example.samsung.xiaoshixunqizhong.adapter.HomeAdapter;
import com.example.samsung.xiaoshixunqizhong.bean.Home;
import com.example.samsung.xiaoshixunqizhong.model.ImpHomeModel;
import com.example.samsung.xiaoshixunqizhong.presenter.ImpHomePresenter;
import com.example.samsung.xiaoshixunqizhong.view.HomeView;
import com.example.samsung.xiaoshixunqizhong.view.MainActivity;
import com.example.samsung.xiaoshixunqizhong.view.WebActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeView {

    private RecyclerView mRv;
    private MainActivity activity;
    private ArrayList<Home> list;
    private HomeAdapter homeAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            initData();
        }
    }

    private void initData() {
        ImpHomePresenter impHomePresenter = new ImpHomePresenter(new ImpHomeModel(), this);
        impHomePresenter.getData();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRv = getView().findViewById(R.id.rv);
        activity = (MainActivity) getActivity();
        mRv.setLayoutManager(new LinearLayoutManager(activity));
        list = new ArrayList<>();
        homeAdapter = new HomeAdapter(activity, list);
        mRv.setAdapter(homeAdapter);
    }

    @Override
    public void onSuccess(final List<Home> home) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                list.addAll(home);
                homeAdapter.notifyDataSetChanged();
                homeAdapter.setMyOnClick(new HomeAdapter.MyOnClick() {
                    @Override
                    public void click(int i) {
                        Home home1 = list.get(i);
                        Intent intent = new Intent(activity, WebActivity.class);
                        String html = home1.getHtml();
                        intent.putExtra("html",html);
                        activity.startActivity(intent);
                    }
                });
            }
        });
    }

    @Override
    public void onFail(final String error) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(activity, error, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
