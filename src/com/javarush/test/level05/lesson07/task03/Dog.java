package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public String dogName = null;
    int dogRost;
    String dogColor;
    public void initialize(String name)
    {
        this.dogName = name;
    }
    public void initialize(String name, int rostr)
    {
        this.dogName = name;
        this.dogRost = rostr;
    }
    public void initialize(String name, int rost, String color){
        this.dogName = name;
        this.dogRost = rost;
        this.dogColor = color;
    }

}
