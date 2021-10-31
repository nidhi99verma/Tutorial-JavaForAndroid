package com.example.tut1;

import java.util.Scanner;

public class Arrays7 {

    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Ram";
        students[1] = "Ajai";
        students[2] = "Nidhi";

        System.out.println(students[0]);
        //or
        String[] employees = {"Ram", "Ajai", "Nidhi", "Verma"};
        int[] numbers = {1, 2, 3, 4};

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //
        System.out.println("Please Enter Name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int j = 0; j < employees.length; j++){
            if(name.equals(employees[j])){
                System.out.println(numbers[j]);
            }
        }
    }
}
