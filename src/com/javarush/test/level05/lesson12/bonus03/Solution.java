package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
    /* какая то хуета... задача была проверена на более логичном условии,
     но проверку не прошла на сервере, работая в ИДЕа
     */
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int maximum = 1;

        //напишите здесь ваш код
        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        for(int n = 0; n < N - 1; n++){
            int a = Integer.parseInt(reader.readLine());
            if(a > maximum){
                maximum = a;
            }
        }
        System.out.println(maximum);
    }
}
