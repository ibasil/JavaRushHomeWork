package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int n = 5;
        int maxLength = 0;
        int listSize = 0;

        List<String> list = new ArrayList<String>();
        List<String> longest = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        maxLength = list.get(0).length();
        listSize = list.size();

        for (int i = 0; i < listSize; i++) {

            if(list.get(i).length() >= maxLength) {
                maxLength = list.get(i).length();
            }

        }

        for (int i = 0; i < listSize; i++) {

            if(list.get(i).length() == maxLength) {
                longest.add(list.get(i));
            }
        }

        for(String str : longest) {
            System.out.println(str);
        }
    }
}
