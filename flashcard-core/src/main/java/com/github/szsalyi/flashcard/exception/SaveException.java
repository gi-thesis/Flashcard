package com.github.szsalyi.flashcard.exception;

public class SaveException extends Exception {

    public SaveException(final String message) {
        super(message);
    }

    public SaveException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
