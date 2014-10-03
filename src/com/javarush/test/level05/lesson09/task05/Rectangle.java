package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут
 top, left, width, height (левая координата, верхняя, ширина и высота).
  Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    private int left, top, width, height;
    Rectangle copy;
    public int rec;
    Rectangle(int l, int t, int v, int h){
        this.rec = l + t + v + h;
    }
    Rectangle(int l, int t){
        this.rec = l+t+0+0;
    }
    Rectangle(int l, int t, int h){
        this.rec = l+t+h+h;
    }
    Rectangle(Rectangle copy){
        copy.top = this.top;
        copy.left = this.left;
        copy.width = this.width;
        copy.height = this.height;
    }
}
