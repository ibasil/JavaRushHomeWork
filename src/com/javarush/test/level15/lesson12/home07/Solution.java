package com.javarush.test.level15.lesson12.home07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Файл в статическом блоке
1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
3. Закрой поток ввода методом close().
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String fileName = Constants.FILE_NAME;
        Scanner scanner = null;
        try
        {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        while(scanner.hasNextLine()) {
            String s = scanner.nextLine();
            lines.add(s);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
