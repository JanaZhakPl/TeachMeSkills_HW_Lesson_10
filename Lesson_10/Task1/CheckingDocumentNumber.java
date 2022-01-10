package com.teachmeskills.Lesson_10.Task1;

import com.teachmeskills.Lesson_10.Task1.MyExeptions.ContainsABSException;
import com.teachmeskills.Lesson_10.Task1.MyExeptions.Ends1a2bException;
import com.teachmeskills.Lesson_10.Task1.MyExeptions.Starts555Exception;

public class CheckingDocumentNumber {

    static String isContainABC(String docNum) throws ContainsABSException {
        if (docNum.toUpperCase().contains("ABC")) {
            return "Document number contains abc";
        } else {
            throw new ContainsABSException(docNum + " doesn't contain ABC");
        }
    }

    //Проверить начинается ли номер документа с последовательности 555.
    static String isStart(String docNum) throws Starts555Exception {
        if (docNum.startsWith("555")) {
            return "Document number starts with 555";
        } else {
            throw new Starts555Exception(docNum + " doesn't start with 555");
            // return "No, it doesn't start with 555";
        }
    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    static String isEnd(String docNum) throws Ends1a2bException {
        if (docNum.endsWith("1a2b")) {
            return "Document number ends with 1a2b";
        } else {
            throw new Ends1a2bException(docNum + " doesn't end with 1a2b");
            //return "No, it doesn't end with 1a2b";
        }
    }
}
