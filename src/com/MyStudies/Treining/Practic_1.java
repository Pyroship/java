package com.MyStudies.Treining;

public class Practic_1 {

    public static void main(String[] args) {
        int n = 100;

        double[] arroy = new double[n];
            for (int i = 0; i < arroy.length; i++) {
                arroy[i] = Math.random();

        }

        double min = arroy[0];
        double max = arroy[0];
        double avg = 0;
            for (int i = 0; i < arroy.length; i++) {
                if (max < arroy[i])
                    max = arroy[i];
                if (min > arroy[i])
                    min = arroy[i];
                avg += arroy[i]/ arroy.length;
            }


        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Avg = " + avg);





    }
}
