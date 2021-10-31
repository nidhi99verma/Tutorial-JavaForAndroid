package com.example.tut1;

public class Statement4 {
    public static void main(String[] args) {
        //if else
        int a = 4;
        if(a > 3){
            System.out.println("greater");
        }else if (a < 3){
            System.out.println("less");
        }else{
            System.out.println("three");
        }
        //switch
        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("greater then 3");
        }
        //Loop
        for(int i = 0; i < 10 ; i++){
            System.out.println("i : "+(i+1));
        }
        //while
        while (a < 10){
//            if(a == 4){
//                continue;
//            }
            System.out.println("while");
            a++;
        }
        //do while
        do{
            System.out.println("do while");
        }
        while ( a < 5);
    }
}
