package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);


        if (a > b && a > c)
        {
            if (b > c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + c + " " + b);
        } else
        {
            if (b > a && b > c)
            {
                if (a > c)
                    System.out.println(b + " " + a + " " + c);
                else
                    System.out.println(b + " " + c + " " + a);
            } else
            {
                if (a > b)
                    System.out.println(c + " " + a + " " + b);
                else
                    System.out.println(c + " " + b + " " + a);


            }
        }
    }
}
