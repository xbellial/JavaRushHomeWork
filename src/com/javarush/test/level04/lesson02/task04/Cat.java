package com.javarush.test.level04.lesson02.task04;


public class Cat {

    public static void main(String[] args){
        System.out.println("1");
    }
    private String fullName;

    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;


    }
}
