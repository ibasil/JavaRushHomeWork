package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        //a max, c min
        //a min, c max
        if ((a > b && a > c && c < b) || (c > a && c > b && a < b)) {
            System.out.println(b);
        }

        //b max, c min
        //c max, b min
        if ((b > c && b > a && c < a) || (c > b && c > a && b < a)) {
            System.out.println(a);
        }

        //a max , b min
        //b max, a min
        if ((a > b && a > c  && b < c) || (b > a && b > c && a < c)) {
            System.out.println(c);
        }

    }
}
