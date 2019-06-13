package com.example.samsung.a5_30zuoye1.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.samsung.a5_30zuoye1.HomeActivity;
import com.example.samsung.a5_30zuoye1.R;
import com.example.samsung.a5_30zuoye1.WebActivity;
import com.example.samsung.a5_30zuoye1.adapter.HomeAdapter;
import com.example.samsung.a5_30zuoye1.bean.HomeBean;
import com.example.samsung.a5_30zuoye1.callback.MyOnClick;
import com.example.samsung.a5_30zuoye1.model.ImpHomeModel;
import com.example.samsung.a5_30zuoye1.presenter.ImpHomePresenter;
import com.example.samsung.a5_30zuoye1.view.HomeView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment implements HomeView {

    private RecyclerView mRv;
    private ArrayList<HomeBean.ResultBean.ListBean> list;
    private HomeAdapter homeAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initData();
        return inflater.inflate(R.layout.fragment_school, container, false);
    }

    private void initData() {
        ImpHomePresenter impHomePresenter = new ImpHomePresenter(new ImpHomeModel(), this);
        impHomePresenter.getData();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRv = getView().findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        list = new ArrayList<>();
        homeAdapter = new HomeAdapter(list, getActivity());
        mRv.setAdapter(homeAdapter);
    }

    @Override
    public void onSuccess(final List<HomeBean.ResultBean.ListBean> beanList) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                list.addAll(beanList);
                homeAdapter.notifyDataSetChanged();
                homeAdapter.setMyOnClick(new MyOnClick() {
                    @Override
                    public void click(int i) {
                        String url = list.get(i).getUrl();
                        HomeActivity activity = (HomeActivity) getActivity();
                        Intent intent = new Intent(activity, WebActivity.class);
                        intent.putExtra("s", url);
                        activity.startActivity(intent);
                    }
                });
            }
        });
    }

    @Override
    public void onFail(final String error) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
