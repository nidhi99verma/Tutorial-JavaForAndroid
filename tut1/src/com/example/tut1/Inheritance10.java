package com.example.tut1;

class Animal{
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

    public Animal(String name, String color, int legs, boolean hasTale) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTale = hasTale;
    }

    public void eat(String food){
        System.out.println("Eating "+ food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
}

class Bird extends Animal{

    int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }
//ctr+o
    @Override
    public void eat(String food) {
        //super.eat(food);
        System.out.println("Chewing "+ food);
    }

    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}

class Dog extends Animal{
    public Dog(String name, String color, int legs, boolean hasTale) {
        super(name, color, legs, hasTale);
    }
}

class Shepherd extends Dog{
    public Shepherd(String name, String color, int legs, boolean hasTale) {
        super(name, color, legs, hasTale);
    }
}

public class Inheritance10
{
    public static void main(String[] args)
    {
        Bird phoenix = new Bird("Nina", "Golden", 4, true, 2);
        System.out.println(phoenix.getName());
        phoenix.eat("Meat");
        System.out.println(phoenix.getWings());
        phoenix.fly();

        Dog labradore = new Dog("Tyson", "Black", 4, true);
        System.out.println(labradore.getColor());
        labradore.eat("eggs");
    }
}


