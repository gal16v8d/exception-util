package com.gsdd.exception;

public class TechnicalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TechnicalException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public TechnicalException(String msg) {
        super(msg);
    }

    public TechnicalException(Throwable cause) {
        super(cause);
    }
}
