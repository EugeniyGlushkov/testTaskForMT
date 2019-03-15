package ru.alvisid.testtaskmt.util.exceptions;

/**
 * The exception is thrown when entity is not found.
 *
 * @author Glushkov Evgen
 * @version 1.0
 * @since 2019.15.03
 */
public class NotFoundException extends RuntimeException {
    /**
     * Constructs a new not found exception with the specified detail message.
     *
     * @param message the detail message.
     */
    public NotFoundException(String message) {
        super(message);
    }
}
