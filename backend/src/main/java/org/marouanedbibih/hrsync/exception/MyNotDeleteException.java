package org.marouanedbibih.hrsync.exception;
import java.util.List;

import org.marouanedbibih.hrsync.handler.errors.MyErrRes;
import org.marouanedbibih.hrsync.handler.errors.MyErrorField;



public class MyNotDeleteException extends RuntimeException {
    private MyErrRes response;

    public MyNotDeleteException(String message) {
        super(message);
        this.response = MyErrRes.builder().message(message).build();

    }

    public MyNotDeleteException(MyErrRes response) {
        this.response = response;
    }

    public MyErrRes getResponse() {
        return response;
    }

    public MyNotDeleteException(String message, String field) {
        super(message);
        List<MyErrorField> errors = List.of(MyErrorField.builder().field(field).message(message).build());
        this.response = MyErrRes.builder().errors(errors).build();
    }
}