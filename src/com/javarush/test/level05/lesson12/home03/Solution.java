package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
 Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см,
5 - длина хвоста в см.
*/
public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //Напишите тут ваш код
        Dog Pluto = new Dog("Pluto",5,"Lou");
        Dog PunchDog = new Dog("Punch",8,"Wery");
        Cat Tom = new Cat("Tom", 2, "black");
        Cat Lucas = new Cat("Lucas", 3, "Grey");
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    //Напишите тут ваши классы
    public static class Cat {
        String name;
        int age;
        String color;
        public Cat(String name, int age, String color){
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public static class Dog{
        String name;
        int power;
        String angry;
        public Dog(String name, int power, String angry){
            this.name = name;
            this.power = power;
            this.angry = angry;
        }
    }

}
