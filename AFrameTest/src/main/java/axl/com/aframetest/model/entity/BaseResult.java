package axl.com.aframetest.model.entity;

import java.io.Serializable;

public class BaseResult<T> implements Serializable {
    public String error;
    public String error_code;
    public String statusCode;
    public Boolean success;
    public T content;

    public boolean isOk() {
        return success = "200".equals(statusCode);
    }

    public String getMessage() {
        return error;
    }

    public String getCode() {
        return error_code;
    }

    public T getResult() {
        return content;
    }

}