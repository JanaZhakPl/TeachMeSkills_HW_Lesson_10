package com.teachmeskills.Lesson_10.Task2.MyExceptions2;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
