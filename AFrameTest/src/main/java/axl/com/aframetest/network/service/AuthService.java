package axl.com.aframetest.network.service;

import axl.com.aframetest.model.entity.BaseResult;
import axl.com.aframetest.model.entity.User;
import axl.com.aframetest.network.URLS;
import retrofit2.http.Field;
import retrofit2.http.GET;
import rx.Observable;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 16:27
 * FIXME
 */
public interface AuthService {

    /**
     * 登录接口
     *
     * @param phone    手机号码
     * @param password 密码
     * @return Call
     */
    @GET(URLS.Auth.AUTH_LOGIN_URL)
    Observable<BaseResult<User>>
    login(@Field(URLS.Auth.AUTH_LOGIN_PARAM_PHONE) String phone,
          @Field(URLS.Auth.AUTH_LOGIN_PARAM_PASSWORD) String password);
}
