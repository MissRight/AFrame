package axl.com.aframetest;

import axl.com.aframe.kit.app.RxStarterApp;
import axl.com.aframe.kit.retrofit.Network;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 16:30
 * FIXME
 */
public class AFTApp extends RxStarterApp {
    @Override
    public void onCreate() {
        super.onCreate();
        new Network.Builder().networkDebug(true)
//                .accept(Profile.API_ACCEPT)
                .baseUrl(Profile.API_ENDPOINT)
                .build();

//        Fresco.initialize(appContext());
//
//        InitializeUtil.initialize();
    }
}
