package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int n = 20;
        int[] big = new int[n];
        int[] p1 = new int[n/2];
        int[] p2 = new int[n/2];

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(r.readLine());

        }

        for (int i = 0; i < big.length; i++) {

            if (i < 10) {
                p1[i] = big[i];
            }
            else {
                p2[i - 10] = big[i];
            }
        }

        for (int i = 0; i < p2.length; i++) {
            System.out.println(p2[i]);

        }
    }
}
