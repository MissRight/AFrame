package axl.com.aframetest.model;

import axl.com.aframetest.model.entity.User;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 18:30
 * FIXME
 */
public interface IAuthModel {
    void saveUser(User user);

    User getUser();
}
