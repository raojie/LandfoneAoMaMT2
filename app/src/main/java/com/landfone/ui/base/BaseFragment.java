package com.landfone.ui.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * @Method: BaseFragment
 * @Decription:
 * @Author: raoj
 * @Date 2017/8/25
 **/
public abstract class BaseFragment extends Fragment {
    protected View parentView;
    protected LayoutInflater inflater;

    public abstract int getLayoutResId();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state) {
        parentView = inflater.inflate(getLayoutResId(), container, false);
        this.inflater = inflater;
        return parentView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        attachView();
        initDatas();
        configViews();
    }

    public abstract void attachView();

    public abstract void initDatas();

    /**
     * 对各种控件进行设置、适配、填充数据
     */
    public abstract void configViews();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    protected LayoutInflater getLayoutInflater() {
        return inflater;
    }
}
