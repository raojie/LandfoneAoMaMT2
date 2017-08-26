package com.landfone.ui;

import com.landfone.R;
import com.landfone.ui.base.BaseActivity;

/**
 * @Method: InitActivity
 * @Decription:
 * @Author: raoj
 * @Date 2017/8/25
 **/
public class InitActivity extends BaseActivity{

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initDatas() {

    }

    @Override
    public void configViews() {
        hideWindowFeature();
    }
}
