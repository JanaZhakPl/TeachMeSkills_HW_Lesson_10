package com.teachmeskills.Lesson_10.Task2;


import com.teachmeskills.Lesson_10.Task2.MyExceptions2.WrongInputException;
import com.teachmeskills.Lesson_10.Task2.MyExceptions2.WrongLoginException;
import com.teachmeskills.Lesson_10.Task2.MyExceptions2.WrongPasswordException;
import com.teachmeskills.Lesson_10.Task2.checkingRegistration;

import java.util.Scanner;

/**
     * Создать класс, в котором будет статический метод.
     *  метод принимает на вход три параметра:
     * login
     * password
     * confirmPassword
     * <p>
     * Все поля имеют тип данных String.
     * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
     * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
     * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
     * Также password и confirmPassword должны быть равны.
     * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
     * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
     * – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
     * Метод возвращает true, если значения верны или false в другом случае.
     */
   public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean IsAllowed = false;
        String login;
        String password;
        String confirmPassword;

        while (!IsAllowed) {
            System.out.println("Enter your login: ");
            login = scanner.nextLine();

            System.out.println("Enter your password: ");
            password = scanner.nextLine();

            System.out.println("Confirm your password: ");
            confirmPassword = scanner.nextLine();

            try {
                if (checkingRegistration.isValid(login, password, confirmPassword)) {
                    System.out.println("You are successfully logged in.");
                    IsAllowed = true;
                }
            } catch (WrongLoginException e1) {
                System.out.println("Invalid login: " + e1.getMessage());
                System.out.println();
            } catch (WrongPasswordException e2) {
                System.out.println("Invalid password: " + e2.getMessage());
                System.out.println();
            } catch (WrongInputException e3) {
                System.out.println(e3.getMessage());
            }
        }
    }
}