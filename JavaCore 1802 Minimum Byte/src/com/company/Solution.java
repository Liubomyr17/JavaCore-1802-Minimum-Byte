package com.company;

/*

1802  Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.



 */

import java.io.FileInputStream;
import java.util.Scanner;

/*
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        FileInputStream f = new FileInputStream(reader.nextLine());

        int min = 0;
        if (f.available() > 0)
            min = f.read();
        while (f.available() > 0) {
            int value = f.read();
            if (value < min)
                min = value;

        }
        f.close();
        System.out.println(min);
    }
}




