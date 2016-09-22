package axl.com.aframetest.network;

import axl.com.aframe.kit.retrofit.Network;
import axl.com.aframetest.network.service.AuthService;
import retrofit2.Retrofit;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 16:26
 * FIXME
 */
public class ApiService {

    public static AuthService createAuthService() {
        return retrofit().create(AuthService.class);
    }

    private static Retrofit retrofit() {
        return Network.get().retrofit();
    }
}
