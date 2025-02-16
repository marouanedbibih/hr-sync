package org.marouanedbibih.hrsync.exception;

import java.util.List;

import org.marouanedbibih.hrsync.handler.errors.MyErrRes;
import org.marouanedbibih.hrsync.handler.errors.MyErrorField;
import org.springframework.security.core.AuthenticationException;

public class MyAuthException extends AuthenticationException {
    private MyErrRes response;

    public MyAuthException(String message, String field) {
        super(message);
        response.setErrors(List.of(MyErrorField.builder().message(message).field(field).build()));

    }

    public MyAuthException(String message) {
        super(message);
        response.setMessage(message);
    }

    public MyErrRes getResponse() {
        return response;
    }

}
