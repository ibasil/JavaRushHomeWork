package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        //a max, c min
        if (a > b && a > c && c < b) {
            System.out.println(a + "\n" + b + "\n" + c);
        }
        //a min, c max
        if (c > a && c > b && a < b) {
            System.out.println(c + "\n" + b + "\n" + a);
        }
        //b max, c min
        if (b > c && b > a && c < a) {
            System.out.println(b + "\n" + a + "\n" + c);
        }
        //c max, b min
        if (c > b && c > a && b < a) {
            System.out.println(c + "\n" + a + "\n" + b);
        }
        //a max , b min
        if (a > b && a > c  && b < c) {
            System.out.println(a + "\n" + c + "\n" + b);
        }
        //b max, a min
        if (b > a && b > c && a < c) {
            System.out.println(b + "\n" + c + "\n" + a);

        }
    }
}
