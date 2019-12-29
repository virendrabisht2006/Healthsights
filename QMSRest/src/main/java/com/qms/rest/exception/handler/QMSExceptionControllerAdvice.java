package com.qms.rest.exception.handler;

import com.qms.rest.model.RestResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@RestControllerAdvice
public class QMSExceptionControllerAdvice extends ResponseEntityExceptionHandler {

    //@ExceptionHandler(QMSException.class)
    public final ResponseEntity<RestResult> handleProgramCreatorException(Exception ex, WebRequest request) {
        RestResult restResult = RestResult.getFailRestResult(ex.getMessage());
        return new ResponseEntity<RestResult>(restResult, HttpStatus.BAD_REQUEST);
    }
}