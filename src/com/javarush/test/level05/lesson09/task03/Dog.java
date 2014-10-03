package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public String dog;
    public Dog(String name){
        this.dog = name;
    }
    public Dog(String name, int rost){
        this.dog = name + rost;
    }
    public Dog(String name, int rost, String color){
        this.dog = name + rost + color;
    }

}
