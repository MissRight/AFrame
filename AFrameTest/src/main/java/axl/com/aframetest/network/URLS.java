package axl.com.aframetest.network;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 17:28
 * FIXME
 */
public interface URLS {
    String URL_VERSION = "/v1";

    interface Auth {
        String AUTH_LOGIN_URL = URL_VERSION + "/rest/user/loginUser";
        String AUTH_LOGIN_PARAM_PHONE = "phone";
        String AUTH_LOGIN_PARAM_PASSWORD = "password";
    }
}
