package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/
public class Circle
{
    //Напишите тут ваш код
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;
    public int circle;
    public Circle(int cx, int cy, int r){
        this.circle = cx + cy + r;
    }
    Circle(int cx, int cy, int r, int vidth){
        this.circle = cx + cy + r + vidth;
    }
    Circle(int cx, int cy, int r, int vidth, String color){
        this.centerX = cx;
        this.centerY = cy;
        this.radius = r;
        this.width = vidth;
        this.color = color;
    }

}
