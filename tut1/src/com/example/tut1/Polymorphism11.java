package com.example.tut1;

class Animals{
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

    public Animals(String name, String color, int legs, boolean hasTale) {
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

class Birds extends Animals{

    int wings;

    public Birds(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }
    //Pplymorphism: 1
    @Override
    public void eat(String food) {
        //super.eat(food);
        System.out.println("Chewing "+ food);
    }
    //Pplymorphism: 2
    public void fly() {
        System.out.println(this.getName() + " is flying");
    }
    public void fly(int speed) {
        System.out.println(this.getName() + " is flying with speed of "+speed);
    }
    public void fly(String name) {
        System.out.println(name + " is also a bird");
    }
    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}

class Dogs extends Animals{
    public Dogs(String name, String color, int legs, boolean hasTale) {
        super(name, color, legs, hasTale);
    }
}

class Shepherds extends Dogs{
    public Shepherds(String name, String color, int legs, boolean hasTale) {
        super(name, color, legs, hasTale);
    }
}

public class Polymorphism11
{
    public static void main(String[] args)
    {
        Birds phoenix = new Birds("Nina", "Golden", 4, true, 2);
        System.out.println(phoenix.getName());
        phoenix.eat("Meat");
        System.out.println(phoenix.getWings());
        phoenix.fly();
        phoenix.fly(100);
        phoenix.fly("Dodod");

        Dogs labradore = new Dogs("Tyson", "Black", 4, true);
        System.out.println(labradore.getColor());
        labradore.eat("eggs");
    }
}

//Polymorphism:
// 1> more then one same method inside parent and child class that are doing the same job differently(using @Override).
// 2> Same method with different type of argument