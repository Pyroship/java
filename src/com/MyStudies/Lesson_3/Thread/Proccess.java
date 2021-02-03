package com.MyStudies.Lesson_3.Thread;

public class Proccess extends Thread{

    private volatile boolean isRun = true;

    @Override
    public void run() {
        super.run();
        while (isRun){
            System.out.println("Привет");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void exit(){
        isRun = false;
    }
}
