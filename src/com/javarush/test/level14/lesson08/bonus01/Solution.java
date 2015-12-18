package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try {
            float i = 1 / 0; //ArithmeticException
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try {
            int number = Integer.parseInt("number"); //NumberFormatException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[0];
            System.out.println(array[0]); //ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5]; //NegativeArraySizeException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*'); //ArrayStoreException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object ch = new Character('*');
            System.out.println((Byte)ch); //ClassCastException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String szShortString = "abc";
            char chr = szShortString.charAt(3); // StringIndexOutOfBoundsException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNulArray = new int[7];
            nNulArray = null;
            int i = nNulArray.length; //NullPointerException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream file = new FileInputStream("d:\\xyz.txt"); //FileNotFoundException

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new InstantiationException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
