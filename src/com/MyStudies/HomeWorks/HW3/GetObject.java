package com.MyStudies.HomeWorks.HW3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetObject {

    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
            Person p = (Person) ois.readObject();
            System.out.println(p.toString());
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
