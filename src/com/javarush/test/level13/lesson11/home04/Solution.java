package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String fileName = reader.readLine();
            FileWriter output = new FileWriter(fileName);

            while(true) {

                String line = reader.readLine();

                if(!line.equals("exit")) {
                    output.write(line + "\r\n");

                } else {

                    output.write("exit \r\n");
                    output.close();
                    break;
                }
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
