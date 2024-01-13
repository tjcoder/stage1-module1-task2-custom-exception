package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(String s) {
        super(s);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
