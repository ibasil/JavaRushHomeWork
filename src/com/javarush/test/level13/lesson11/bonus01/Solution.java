package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution
{
    public static void main(String[] args)
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new TreeSet<Integer>();
        String fileName = null;
        Scanner scanner = null;


        try
        {
            System.out.println("Введите полный путь и имя файла с данными:");
            fileName = reader.readLine();
            scanner = new Scanner(new File(fileName));

            while(scanner.hasNextInt()) {
                int i = scanner.nextInt();

                if(i % 2 == 0) {
                    set.add(i);
                }
            }

            for(Integer digit : set) {
                System.out.println(digit);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
