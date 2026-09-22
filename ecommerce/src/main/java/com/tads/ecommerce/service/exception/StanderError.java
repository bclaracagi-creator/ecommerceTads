package com.tads.ecommerce.service.exception;

import java.time.Instant;

public class StanderError {
    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
