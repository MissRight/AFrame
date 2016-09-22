package axl.com.aframetest.network.service;

import axl.com.aframetest.entity.User;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
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
     * @param phone 手机号码
     * @param password 密码
     * @return Call
     */
    @FormUrlEncoded
    @POST("/auth/login")
    Observable<User>
    login(@Field("phone") String phone,
          @Field("password") String password);
}
