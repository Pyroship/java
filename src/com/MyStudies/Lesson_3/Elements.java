package com.MyStudies.Lesson_3;

public class Elements extends Thread{

    @Override
    public void run(){
        for(int i = 1; i <= 10; i++)
            System.out.println("Элемент: " + i);
    }
}
