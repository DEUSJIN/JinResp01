package pers.jin.springmvc.exception;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 21:51
 */
public class CustomerHasExist extends RuntimeException{
    public CustomerHasExist() {
        super();
    }

    public CustomerHasExist(String message) {
        super(message);
    }

    public CustomerHasExist(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerHasExist(Throwable cause) {
        super(cause);
    }

    protected CustomerHasExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
