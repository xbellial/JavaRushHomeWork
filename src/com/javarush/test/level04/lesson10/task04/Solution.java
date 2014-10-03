package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int x = 0;
        String s = "S";
        while (x < 10){
            int y = 0;
            while(y < 10)
            {
                System.out.print(s);
                y++;
            }
            System.out.println();
            x++;

        }

    }
}
