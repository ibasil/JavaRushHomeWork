package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0
соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> numbersArray = new ArrayList<>();

        int[] array5 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{0, 11};
        int[] array4 = new int[]{2, 4, 6, 8 };
        int[] array7 = new int[]{1, 3, 5, 7, 9, 11, 13};
        int[] array0 = new int[]{};

        numbersArray.add(array5);
        numbersArray.add(array2);
        numbersArray.add(array4);
        numbersArray.add(array7);
        numbersArray.add(array0);

        return numbersArray;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
