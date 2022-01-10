package com.teachmeskills.Lesson_10.Task2.MyExceptions2;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
