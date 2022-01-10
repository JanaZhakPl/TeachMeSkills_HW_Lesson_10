package com.teachmeskills.Lesson_10.Task1;

import com.teachmeskills.Lesson_10.Task1.MyExeptions.ContainsABSException;
import com.teachmeskills.Lesson_10.Task1.MyExeptions.Ends1a2bException;
import com.teachmeskills.Lesson_10.Task1.MyExeptions.Starts555Exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Enter the number of document in format xxxx-yyy-xxxx-yyy-xyxy");
        Scanner s = new Scanner(System.in);
        String documentNumber = s.nextLine();
        System.out.println("Your document`s number is " + documentNumber);

        try {
            System.out.println(CheckingDocumentNumber.isContainABC(documentNumber));
        } catch (ContainsABSException e) {
            System.out.println(documentNumber + "  doesn`t contain abc");
        }

        try {
            System.out.println(CheckingDocumentNumber.isStart(documentNumber));
        } catch (Starts555Exception e) {
            System.out.println(documentNumber + "  doesn`t start with 555");
        }

        try {
            System.out.println(CheckingDocumentNumber.isEnd(documentNumber));
        } catch (Ends1a2bException e) {
            System.out.println(documentNumber + "  doesn`t end with 1b2b");
        }
        System.out.println("Your number is registered");

    }
}
//1234-aBc-5678-def-9j1H
//5554-aBc-5678-def-9j1H
//1234-aBc-5678-def-1a2b
//5554-aBc-5678-def-1a2b
