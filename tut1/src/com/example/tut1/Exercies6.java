package com.example.tut1;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Exercies6 {
    public static void main(String[] args) {

        System.out.println("Welcome");
        System.out.println("Please Enter your name : ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Shall we start game, if Yes then write Yes and for No press any key : ");
        String permission = scanner.next();

        //System.out.println(permission.getClass().getName());

        if(Objects.equals(permission, "Yes")){

            Random random = new Random();
            int num = random.nextInt(9) + 1;
            System.out.println("Please guess a positive number between 1 to 10 : ");

            for (int i = 0; i < 5; i++){
                int guessNum = scanner.nextInt();
                if(guessNum == num){
                    System.out.println("Congratulation "+ name +" have guess in your "+ i +" guess.");
                    i = 5;
                }else if(guessNum < num){
                    System.out.println("Hint : Please guess more higher number");
                }else if(i == 4){
                    System.out.println("Game Over");
                    System.out.println("The number was : "+ num);
                }else{
                    System.out.println("Hint : Please guess more lower number");
                }
            }
        }
    }
}
