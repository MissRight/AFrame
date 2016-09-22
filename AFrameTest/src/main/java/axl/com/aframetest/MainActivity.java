package axl.com.aframetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.orhanobut.logger.Logger;

import axl.com.aframe.kit.rx.RxSchedulersHelper;
import axl.com.aframetest.network.ApiService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiService.createAuthService().login("123", "123").compose(RxSchedulersHelper.io_main()).subscribe(user -> {
            Toast.makeText(MainActivity.this, user.toString(), Toast.LENGTH_SHORT).show();
        }, Logger::d);
    }
}
