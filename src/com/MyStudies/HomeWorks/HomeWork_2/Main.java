package com.MyStudies.HomeWorks.HomeWork_2;

public class Main {

    public static void main(String[] args) {
        // Создаем объекты
        Player bot = new Player(); // Есть конструкор без параметров
        System.out.println("Игрок 1: " + bot.name + " Выкидывает:  " + bot.set);
     Player alex = new Player(Variants.SCISSORS, "Alex"); // А есть конструктор с параметрами
        System.out.println("Игрок 2: " + alex.name + " Выкидывает: " + alex.set);


// Получаем результат

        System.out.println(bot.whoWins(bot,alex));// Не смог я сделать bot.whoWins(bot, alex),
                                        // поэтому пошел окольными путями)



    }
}
