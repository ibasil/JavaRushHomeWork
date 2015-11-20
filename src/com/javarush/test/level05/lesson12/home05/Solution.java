package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        boolean active = false;
        int sum = 0;

        while(!active) {
            String s = r.readLine();
            if (s.equals("сумма")) {
                active = true;
            } else {
                sum += Integer.parseInt(s);
            }
        }

        System.out.println(sum);
    }
}
