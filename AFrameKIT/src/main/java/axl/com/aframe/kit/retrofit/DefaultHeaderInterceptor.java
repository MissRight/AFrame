package axl.com.aframe.kit.retrofit;

import android.text.TextUtils;

import java.io.IOException;

import axl.com.aframe.kit.account.AccountManager;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class DefaultHeaderInterceptor implements HeaderInterceptor {

  private Headers.Builder builder;
  public DefaultHeaderInterceptor(Headers.Builder builder) {
    this.builder = builder;
  }

  @Override public Response intercept(Interceptor.Chain chain) throws IOException {
    Request originalRequest = chain.request();
    if (builder == null) {
      builder = new Headers.Builder();
    }

    final String token = AccountManager.INSTANCE.token();
    if (!TextUtils.isEmpty(token)) {
      builder.set("Authorization", "Bearer " + token);
    }

    Request compressedRequest = originalRequest
        .newBuilder()
        .headers(builder.build())
        .build();

    return chain.proceed(compressedRequest);
  }
}