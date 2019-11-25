package com.example.gzj_moileshop.activity;

import android.text.TextUtils;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.OnClick;
import com.example.gzj_moileshop.R;
import com.example.gzj_moileshop.common.BaseActivity;
import com.example.gzj_moileshop.http.entity.MemberEntity;
import com.example.gzj_moileshop.http.perdenter.MemberPresenter;
import com.example.gzj_moileshop.ProgressDialogSubscriber;
import com.example.gzj_moileshop.utils.SystemCofig;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.et_username)
    EditText etUsername;

    @BindView(R.id.et_pwd)
    EditText etPwd;


    @Override
    public int getContentViewId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.iv_back)
    void close(){finish();}

    @OnClick(R.id.bt_login)
    void login(){
        String userName = etUsername.getText().toString().trim();
        String pwd = etPwd.getText().toString().trim();
        if(TextUtils.isEmpty(userName)){
            toastShort("请输入用户名");
            return;
        }if (TextUtils.isEmpty(pwd)){
            toastShort("请输入密码");
            return;
        }
        MemberPresenter.login(new ProgressDialogSubscriber<MemberEntity>(this) {
            @Override
            public void onNext(MemberEntity memberEntity) {
                SystemCofig.setLogin(true);
                toastShort("登陆成功");
                SystemCofig.setLoginUserName(memberEntity.uname);
                SystemCofig.setLoginUserEmail(memberEntity.email);
                SystemCofig.setLoginUserHead(memberEntity.image);
                setResult(RESULT_OK);
                finish();
            }

        },userName,pwd);
    }
}
