package com.MyStudies.Treining;


import java.time.Year;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Number 1:");
       int i1 = in.nextInt();
        System.out.println("Number 2: ");
        int i2 = in.nextInt();
        boolean b;
     b = ((i1 % 2) == 0 && (i2 % 2) == 0) ? true : false;

        System.out.println(b);

    }



}
