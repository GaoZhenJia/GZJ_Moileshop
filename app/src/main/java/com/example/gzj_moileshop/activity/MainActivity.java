package com.example.gzj_moileshop.activity;

import androidx.annotation.LayoutRes;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.gzj_moileshop.R;
import com.example.gzj_moileshop.common.BaseActivity;
import com.example.gzj_moileshop.fragment.NavigationFragment;

public class MainActivity extends BaseActivity {


    @Override
    public @LayoutRes
    int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_main,new NavigationFragment());
        transaction.commit();
    }
}


