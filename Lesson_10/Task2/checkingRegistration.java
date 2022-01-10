package com.teachmeskills.Lesson_10.Task2;

import com.teachmeskills.Lesson_10.Task2.MyExceptions2.WrongInputException;
import com.teachmeskills.Lesson_10.Task2.MyExceptions2.WrongLoginException;
import com.teachmeskills.Lesson_10.Task2.MyExceptions2.WrongPasswordException;

public class checkingRegistration {

    public static boolean isValid(String login, String password, String confirmPassword)
            throws WrongLoginException,WrongPasswordException, WrongInputException {

        if (login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            throw new WrongInputException("Please fill in all fields");
        }

        if ((login.length() > 20) || (login.contains(" "))) {
            throw new WrongLoginException("Your login must be less than 20 characters long without spaces ");
        }

        if ((password.length() < 20) || (!password.contains(" "))) {
            if (!password.matches(".*\\d.*")) {
                throw new WrongPasswordException("Your password must contain at least 1 number  ");
            }
        } else {
            throw new WrongPasswordException("Your password must be less than 20 characters long without spaces ");
        }

        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Your passwords don't match");
        }

        return true;
    }
}

