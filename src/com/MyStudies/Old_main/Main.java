package com.MyStudies.Old_main;

public class Main {


    public static void main(String[] args) {
        String[] names = new String[] {"Джон","Боб","Джордж"};
        String[] surnames = new  String[] {"Марли", "Джерки", "Скворовский"};
        int[] ages = new int[] {50, 21, 18};

        printArr(names);
        printArr(surnames);
        printArr(ages);


        int result = summa(5, 10);
        printArr(result);

    }

    public  static int summa(int a, int b){
        int res = a + b;
        return res;


    }


        public static void printArr( String [] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.println("Значение элемента: " + arr[i]);
        }

        public static void printArr( int [] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.println("Значение элемента: " + arr[i]);}

        public static void printArr(int a) {
                System.out.println(a);
            }

    }

