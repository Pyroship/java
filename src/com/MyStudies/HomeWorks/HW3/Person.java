package com.MyStudies.HomeWorks.HW3;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
     String login;
    int age;
     String hobby;

    public Person(String name, String login, int age, String hobby){
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobby = hobby;
    }
    @Override
    public String toString (){
        return   "Пользователь: "+ name + " с логином: " + login + ". Его возраст: "
        + age + ". Все хобби: " + hobby;

    }
}
