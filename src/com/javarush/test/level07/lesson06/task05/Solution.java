package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int n = 5;
        String temp = "";
        String last = "";
        int listSize = 0;

        List<String> list = new ArrayList<String>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            temp = r.readLine();
            list.add(temp);
        }
        listSize = list.size() - 1;

        for (int i = 0; i < 13; i++) {

            last = list.get(listSize);
            list.remove(listSize);
            list.add(0, last);

        }

        for(String str: list) {
            System.out.println(str);
        }
    }
}
