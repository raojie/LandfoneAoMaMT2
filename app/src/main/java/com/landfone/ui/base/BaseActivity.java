package com.landfone.ui.base;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * @Method: BaseActivity
 * @Decription:
 * @Author: raoj
 * @Date 2017/8/25
 **/
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initDatas();
        configViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public abstract int getLayoutId();

    public abstract void initDatas();

    /**
     * 对各种控件进行设置、适配、填充数据
     */
    public abstract void configViews();
}
