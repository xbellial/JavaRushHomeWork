package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        String d = reader.readLine();
        int a = Integer.parseInt(c);
        int b = Integer.parseInt(d);
        for (int q = 0; q < a; q++){
            System.out.println();
                for (int w = 0; w < b; w++){
                System.out.print("8");
            }
        }

    }
}
