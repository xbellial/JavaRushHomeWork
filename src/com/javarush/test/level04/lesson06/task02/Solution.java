package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        String n4 = reader.readLine();

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);
        int d = Integer.parseInt(n4);
        int a1, b1, e;

        if(a < b)
               a1 = b;
          else a1 = a;
        if (c < d)
            b1 = d;
        else
            b1 = c;
        if(a1 < b1)
            System.out.println(b1);
        else
            System.out.println(a1);





    }
}
