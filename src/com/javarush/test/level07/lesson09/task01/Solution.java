package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int n = 20;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> divisible2 = new ArrayList<Integer>();
        List<Integer> divisible3 = new ArrayList<Integer>();
        List<Integer> other = new ArrayList<Integer>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(r.readLine()));
        }

        for (int i = 0; i < n; i++) {

            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                divisible3.add(list.get(i));
                divisible2.add(list.get(i));
            }
            else if (list.get(i) % 3 == 0) {
                divisible3.add(list.get(i));
            }
            else if (list.get(i) % 2 == 0) {
                divisible2.add(list.get(i));
            }
            else {
                other.add(list.get(i));
            }

        }

        System.out.println("%3");
        printList(divisible3);

        System.out.println("%2");
        printList(divisible2);

        System.out.println("other");
        printList(other);


    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}
