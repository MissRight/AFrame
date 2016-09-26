package axl.com.aframetest;

import axl.com.aframe.kit.retrofit.Network;
import axl.com.aframe.ui.app.SupportApp;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 16:30
 * FIXME
 */
public class AFTApp extends SupportApp {
    @Override
    public void onCreate() {
        super.onCreate();
        isDebug = true;
        new Network.Builder().networkDebug(true)
//                .accept(Profile.API_ACCEPT)
                .baseUrl(Profile.API_ENDPOINT)
                .build();

//        Fresco.initialize(appContext());
//
//        InitializeUtil.initialize();
    }
}
