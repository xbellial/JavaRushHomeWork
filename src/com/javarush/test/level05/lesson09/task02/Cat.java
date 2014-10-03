package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен,
 то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
  То же касательно возраста. А вот имени может и не быть (null).
  То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    public String cat;
    public int weight = 2;
    public String name = null;
    String addres = null;
    int age = 2;
    public Cat(){
        this.cat = name;
    }
    public Cat(String name, int weight, int age){
        this.cat = name + weight + age;
    }
    public Cat(String name, String age, String weight){
        this.cat = name + age + weight;
    }
    public Cat(String weight, String color){
        this.cat = weight + color;
    }
    public Cat(int age, String color, String addres){
        this.cat = age + color + addres;
    }
}
