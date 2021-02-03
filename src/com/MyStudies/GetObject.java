package com.MyStudies;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetObject {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("main.itproger");// Метод для чтения файла
            ObjectInputStream ois = new ObjectInputStream(fis);

            Course android = (Course) ois.readObject();
            Course kotlin = (Course) ois.readObject();

            System.out.println(android);
            System.out.println(kotlin);


            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
