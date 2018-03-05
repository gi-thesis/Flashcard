package com.github.szsalyi.flashcard.exception;

public class ReadException extends Exception {

    public ReadException(final String message) {
        super(message);
    }

    public ReadException(final String message, final Throwable cause) {
        super(message, cause);
    }
}

