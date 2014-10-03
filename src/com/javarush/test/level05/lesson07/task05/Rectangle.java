package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width,
height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    int left = 0, top = 0, width = 0, height = 0;
    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.height = height;
        this.top = top;
        this.width = width;
    }
    public void initialize(int left, int height){
        this.left = left;
        this.height = height;
    }
    public void initialize(int left, int width, int height){
        this.left = left;
        this.height = height;
        this.top = width;
        this.width = width;
    }
    public void initialize(Rectangle copy)
    {
        copy.top = this.top;
        copy.left = this.left;
        copy.width = this.width;
        copy.height = this.height;
    }

}
