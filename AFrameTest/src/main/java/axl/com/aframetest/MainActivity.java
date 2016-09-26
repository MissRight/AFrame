package axl.com.aframetest;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.orhanobut.logger.Logger;

import axl.com.aframe.kit.rx.RxSchedulersHelper;
import axl.com.aframe.ui.activity.BaseActivity;
import axl.com.aframetest.auto.LoginContract;
import axl.com.aframetest.network.ApiService;

import static axl.com.aframe.kit.utils.Preconditions.checkNotNull;

public class MainActivity extends BaseActivity implements LoginContract.View{

    LoginContract.Presenter mPresenter;


    @Override
    public void initParams(Bundle params) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void doBusiness(Context mContext) {
        ApiService.createAuthService().login("123", "123").compose(RxSchedulersHelper.io_main()).subscribe(user -> {
            Toast.makeText(MainActivity.this, user.toString(), Toast.LENGTH_SHORT).show();
        }, Logger::d);
    }

    @Override
    public void widgetClick(View v) {

    }

    @Override
    public void onResume() {
        super.onResume();
//        mPresenter.start();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
