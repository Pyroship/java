package com.MyStudies.HomeWorks.HomeWork_2;


import java.util.Random;

public class Player {
     String name;
     Variants set;

    Player() {
        this.name = "Bot";
        int i = new Random().nextInt(3);
        if (i == 0) this.set = Variants.PAPER;
        else if (i == 1) this.set = Variants.ROCK;
        else this.set = Variants.SCISSORS;

    }


    Player(Variants set, String name) {
        this.name = name;
        this.set = set;
    }

    public  String whoWins( Player x, Player y){
        if( x.set == y.set)
            return "Ничья";
        else if((x.set == Variants.ROCK && y.set == Variants.SCISSORS) ||
                (x.set == Variants.SCISSORS && y.set == Variants.PAPER) ||
                (x.set == Variants.PAPER && y.set == Variants.ROCK))
                return "Победил игрок: " + x.name;
        else
            return "Победил игрок: " + y.name;
    }

//    public void whoWins(Variants x, Variants y) {
//        if( x == Variants.SCISSORS && y == Variants.SCISSORS)
//            System.out.println("Ничья");
//        else if(x == Variants.PAPER && y == Variants.SCISSORS)
//            System.out.println("Побеждает второй игрок!");
//        else if(x == Variants.ROCK && y == Variants.SCISSORS)
//            System.out.println("Побеждает первый игрок!");
//
//        if( x == Variants.PAPER && y == Variants.PAPER)
//            System.out.println("Ничья");
//        else if(x == Variants.ROCK && y == Variants.PAPER)
//            System.out.println("Побеждает второй игрок!");
//        else if(x == Variants.SCISSORS && y == Variants.PAPER)
//            System.out.println("Побеждает первый игрок!");
//
//        if( x == Variants.ROCK && y == Variants.ROCK)
//            System.out.println("Ничья");
//        else if(x == Variants.SCISSORS && y == Variants.ROCK)
//            System.out.println("Побеждает второй игрок!");
//        else if(x == Variants.PAPER && y == Variants.ROCK)
//            System.out.println("Побеждает первый игрок!");
//
//
//
//
//    }


}

