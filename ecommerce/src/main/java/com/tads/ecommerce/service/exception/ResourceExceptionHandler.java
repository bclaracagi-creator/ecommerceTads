package com.tads.ecommerce.service.exception;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ResourceExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StanderError> entityNotFound(
            ResourceNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StanderError error = new StanderError();
        error.setTimestamp(Instant.now)());
        error.setStatus(status.value()));
        error.setError ("Entity not found");
        error.setPath(request.getRequestURI());

        return  null;
    }
    )
}
