package com.example.samsung.a5_30zuoye1.fragment;


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

import com.example.samsung.a5_30zuoye1.HomeActivity;
import com.example.samsung.a5_30zuoye1.MainActivity;
import com.example.samsung.a5_30zuoye1.R;
import com.example.samsung.a5_30zuoye1.WebActivity;
import com.example.samsung.a5_30zuoye1.adapter.AttentionAdapter;
import com.example.samsung.a5_30zuoye1.bean.Attention;
import com.example.samsung.a5_30zuoye1.callback.MyOnClick;
import com.example.samsung.a5_30zuoye1.model.ImpAttentionModel;
import com.example.samsung.a5_30zuoye1.presenter.ImpAttentionPresenter;
import com.example.samsung.a5_30zuoye1.view.AttentionView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttentionFragment extends Fragment implements AttentionView {

    private RecyclerView mRv1;
    private ArrayList<Attention.ResultBean.DataBean> dataBeans;
    private AttentionAdapter attentionAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ImpAttentionPresenter impAttentionPresenter = new ImpAttentionPresenter(new ImpAttentionModel(), this);
        impAttentionPresenter.getData();
        return inflater.inflate(R.layout.fragment_attention, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRv1 = getView().findViewById(R.id.rv1);
        mRv1.setLayoutManager(new LinearLayoutManager(getActivity()));
        dataBeans = new ArrayList<>();
        attentionAdapter = new AttentionAdapter(dataBeans, getActivity());
        mRv1.setAdapter(attentionAdapter);
    }

    @Override
    public void onSuccess(final List<Attention.ResultBean.DataBean> beanList) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                dataBeans.addAll(beanList);
                attentionAdapter.notifyDataSetChanged();
                attentionAdapter.setMyOnClick(new MyOnClick() {
                    @Override
                    public void click(int i) {
                        String url = dataBeans.get(i).getUrl();
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
