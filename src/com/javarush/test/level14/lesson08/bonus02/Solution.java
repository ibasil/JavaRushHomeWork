package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    /*
Алгоритм Евклида позволяет найти нам НОД. Как это работает:
   Пусть a = 18, b = 30.
   Цикл: a!=0 and b!=0
   Если a > b, то a = a % b, если меньше, то b = b % a, таким образом мы сначала находим остаток деления, а потом
   повторяем действия. У нас a < b, значит, ищем остаток деления b % a (30 % 18) = 12, присваиваем b = 12,
   повторяем цикл но теперь у нас уже a > b(b = 12)
  значит выполняем a % b (18 % 12) = 6? снова переходим к циклу, теперь снова b > a, значит выполняем b % a (30 % 6),
  остаток от деления 0, на этом мы прекращаем наш цикл и узнаем, что наибольший общий делитель 18 и 30 = 6.
  Выводим a + b (b = 0, a = 6).
  */
    public static int getNOD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
    return a;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ввведите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Ввведите второе число: ");
        int b = Integer.parseInt(reader.readLine());

        int nod = getNOD(a, b);
        System.out.println("Наибольший общий делитель чисел " + a + " и " + b + " равен: " + nod);
    }
}
