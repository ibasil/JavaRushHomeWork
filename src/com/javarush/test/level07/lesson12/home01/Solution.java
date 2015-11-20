package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = 10;
        int tmp = 0;
        List<Integer> numbers = new ArrayList<Integer>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(r.readLine());
            numbers.add(tmp);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(numbers.size() - i - 1));
        }
    }
}
