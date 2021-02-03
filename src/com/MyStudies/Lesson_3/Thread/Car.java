package com.MyStudies.Lesson_3.Thread;

import java.util.Scanner;

public class Car {

    public void moveCar() throws InterruptedException{
        synchronized (this) {
            System.out.println("Машина в движении");
            wait();

        }
    }
    public void stopCar() throws InterruptedException{
        Scanner in = new Scanner(System.in );
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Нажмите что нибудь для остановки машины");
            in.nextLine();
            notify();
            System.out.println("Машина остановлена");

        }

    }
}
