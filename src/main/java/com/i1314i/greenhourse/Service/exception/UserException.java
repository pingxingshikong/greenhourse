package com.i1314i.greenhourse.Service.exception;

/**
 * @author 平行时空
 * @created 2018-04-28 14:58
 **/
public class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
