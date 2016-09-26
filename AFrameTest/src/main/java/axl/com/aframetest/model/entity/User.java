package axl.com.aframetest.model.entity;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 16:28
 * FIXME
 */
public class User {

    public String id;
    public String nickName;
    public String password;
    public String headImage;
    public String phone;
    public String gender;
    public String platformId;
    public String platformName;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", headImage='" + headImage + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", platformId='" + platformId + '\'' +
                ", platformName='" + platformName + '\'' +
                '}';
    }
}
