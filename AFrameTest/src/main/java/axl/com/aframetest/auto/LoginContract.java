package axl.com.aframetest.auto;

import axl.com.aframetest.BasePresenter;
import axl.com.aframetest.BaseView;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-23
 * Time: 17:44
 * FIXME
 */
public interface LoginContract {
    interface View extends BaseView<Presenter> {

        void showLoading();

    }

    interface Presenter extends BasePresenter {

        void login(int requestCode, int resultCode);

    }
}
