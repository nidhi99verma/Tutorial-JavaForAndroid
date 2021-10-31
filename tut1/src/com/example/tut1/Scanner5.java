package com.example.tut1;

import java.util.Random;
import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        System.out.println("Please Inter the Number : ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        System.out.println("answer was : " + answer);
        System.out.println("Please Inter the Name : ");
        String name = scanner.next();
        System.out.println("Hello "+name);

        Random random = new Random();
        int num = random.nextInt(9)+1;
        System.out.println("Your lucky number is : "+num);
    }
}
