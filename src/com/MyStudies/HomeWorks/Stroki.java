package com.MyStudies.HomeWorks;

public class Stroki {

    public static void main(String[] args) {
         String  str = "Hello, I am the 1!";

         char[] ch = str.toCharArray();

         int symbols = 0;
         int space = 0;
         int inegers = 0;
         int other = 0;

         for (int i = 0; i < ch.length; i++ ){
            if(Character.isLetter(ch[i]))
                symbols ++;
            else if(Character.isSpaceChar(ch[i]))
                space ++;
            else if(Character.isDigit(ch[i]))
                inegers++;
            else
                other ++;

         }
        System.out.println("Букв: "+ symbols);
        System.out.println("Пробелов: "+ space);
        System.out.println("Цифр: "+ inegers);
        System.out.println("Прочих символов: "+ other);
    }
}
