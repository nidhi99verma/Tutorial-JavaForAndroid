package com.example.tut1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Students{
    private String name;
    private int id;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Collection14 {
    public static void main(String[] args) {
//ArrayList
/*
        String[] names = {"Ram", "Ajai", "Nidhi", "Shyam"};
        System.out.println(names[2]);
        names[4] = "Verma" //not able to add in this array

        this is not right way
        String[] newNames = new String[5];
        for(int i=0; i < names.length; i++){
            newNames[i] = names[i];
        }
        newNames[4] = "Verma";
        System.out.println(newNames[4])
        */;

        //arrays length is not fix
        ArrayList<String> names = new ArrayList<>();
        //or
//        List<String> students = new ArrayList<>();
        names.add("Meisam");
        names.add("Sarah");
        System.out.println(names.get(0));
        System.out.println(names.size());
        //names.clear();
        System.out.println(names.size());
        names.remove("Meisam");
        System.out.println(names.get(0));
        System.out.println(names.contains("Meisam"));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Meisam"));
        System.out.println(names.indexOf("Sarah"));

        ArrayList<Integer> age = new ArrayList<>(); //int : premitive but Integer : Non-premitive

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

//Maps
        //can not use premitive data type inside<String String> ex: <int int> but can use <Integer Integer>
        Map<String, String> emailList = new HashMap<>();
        emailList.put("Tom", "Tom@meicode.org");
        emailList.put("Brad", "Brad@gmail.com");
        System.out.println(emailList.get("Tom"));
        System.out.println(emailList.size());
        emailList.remove("Brad");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Tom"));
        System.out.println(emailList.containsValue("Brad@gmail.com"));

        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Ram", 12 ));
        students.add(new Students("Shyam", 14 ));

//forEach Loop
        for(Students s: students){
            System.out.println(s.getName());
        }
    }
}
//ArrayList : in type arrgument is can not be primitive type
//https://www.javatpoint.com/difference-between-array-and-arraylist