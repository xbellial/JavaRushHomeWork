package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

import javax.sound.midi.SysexMessage;

public class Friend
{
    //Напишите тут ваш код
    String frParam;

    public Friend(String name){
        this.frParam = name;
    }
    public Friend(String name, int age){
        this.frParam = name + age;
    }
    public Friend(String name, String Sex, int age){
        this.frParam = name + age + Sex;
    }


}