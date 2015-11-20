package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        List<String> list = new ArrayList<String>();
        String tmp = "";

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());
        int m = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            list.add(r.readLine());
        }

        //1st solution
        list.addAll(list.subList(0, m));
        list.removeAll(list.subList(0, m));
/*
        //2nd solution
        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);
        }*/


        for(String s: list) {
            System.out.println(s);
        }
    }
}
