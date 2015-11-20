package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        int n = 10;
        String tmp = "";
        List<String> list = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            tmp = r.readLine();
            list.add(tmp);
        }


        ArrayList<String> result = doubleValues((ArrayList<String>) list);

        //Вывести на экран result
        for(String s: result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        //напишите тут ваш код
        int n = list.size();
        for (int i = 0; i < n; i++) {
            list.add(2*i + 1, list.get(2*i));
        }
        return list;
    }
}
