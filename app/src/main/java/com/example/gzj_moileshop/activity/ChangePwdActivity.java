package com.example.gzj_moileshop.activity;

import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.example.gzj_moileshop.R;
import com.example.gzj_moileshop.common.BaseActivity;

public class ChangePwdActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @Override
    public int getContentViewId() {
        return R.layout.activity_change_pwd;
    }

    @Override
    protected void initView() {
        super.initView();
        tvTitle.setText("修改密码");
    }

    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }
}

