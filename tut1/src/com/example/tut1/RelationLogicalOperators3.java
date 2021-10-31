package com.example.tut1;

public class RelationLogicalOperators3 {
    public static void main(String[] args) {
        int a = 5;
        a += 2;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
//Comparision
        int i = 5;
        int j = 3;
        boolean k1 = i > j;
        boolean k2 = i == j;
        boolean k3 = i >= j;
        boolean k4 = i <= j;
        boolean k5 = i != j;
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);
        System.out.println(k5);
//Logical
        int x = 4;
        int y = 2;
        boolean ans1 = x==5 || y==2;
        boolean ans2 = x==5 && y==2;
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
