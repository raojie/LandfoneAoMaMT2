package com.landfone.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

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

    public void hideWindowFeature() {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /**
         * 具体根据系统定义，frameworks/base/core/java/android/view/View.java
         * 8-全屏，2-hide navi(home,back…)，1-游戏或电子书模式
         */
        getWindow().getDecorView().setSystemUiVisibility(8);
    }
}
