package com.javarush.test.level06.lesson05.task01;

/* Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable
*/
public class Cat
{
    //Напишите тут ваш код
    String objekt;
    Cat(String objekt){
        this.objekt = objekt;
    }
    protected void finalize() throws Throwable{
        System.out.println(objekt + " уничтожен");
    }
}
