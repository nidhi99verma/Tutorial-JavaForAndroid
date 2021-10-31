package com.example.tut2;

public class ElectricCar17 implements CarInterface17 {

    private String name;

    public ElectricCar17(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//ctr+i
    @Override
    public void start() {
        System.out.println(this); //address of class
        System.out.println("Electricity flow start....");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + " mph");
    }
}
