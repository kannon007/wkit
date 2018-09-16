package com.github.wydcn.wkit.exception;

public class WkitException extends  RuntimeException {
    public WkitException() {
    }

    public WkitException(String message) {
        super(message);
    }

    public WkitException(String message, Throwable cause) {
        super(message, cause);
    }

    public WkitException(Throwable cause) {
        super(cause);
    }

    public WkitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
