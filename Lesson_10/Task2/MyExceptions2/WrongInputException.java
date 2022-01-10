package com.teachmeskills.Lesson_10.Task2.MyExceptions2;

public class WrongInputException extends Exception{
    public WrongInputException() {
    }

    public WrongInputException(String message) {
        super(message);
    }
}
