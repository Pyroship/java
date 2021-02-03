package com.MyStudies.HomeWorks.HW3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




    Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
    String name = in.nextLine();

        System.out.print("Введите логин: ");
        String login = in.nextLine();

        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Введите хобби через запятую: ");
        String hobby = in.nextLine();

        Person p = new Person(name, login, age, hobby );

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
            oos.writeObject(p);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
