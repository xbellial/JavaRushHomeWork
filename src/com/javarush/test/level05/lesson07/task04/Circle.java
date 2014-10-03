package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    int cx;
    int cy;
    int r;
    int vidth;
    int color;

    public void initialize(int cx, int cy, int r){
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }
    public void initialize(int cx, int cy, int r, int vidth){
        this.cx = cx;
        this.cy = cx;
        this.r = r;
        this.vidth = vidth;
    }
    public void initialize(int cx, int cy, int r, int vidth, int color){
        this.cx = cx;
        this.cy = cx;
        this.r = r;
        this.vidth = vidth;
        this.color = color;
    }


}
