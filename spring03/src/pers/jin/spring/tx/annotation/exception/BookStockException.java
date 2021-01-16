package pers.jin.spring.tx.annotation.exception;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/29 19:29
 */
public class BookStockException extends RuntimeException {
    public BookStockException() {
    }

    public BookStockException(String message) {
        super(message);
    }

    public BookStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStockException(Throwable cause) {
        super(cause);
    }

    public BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
