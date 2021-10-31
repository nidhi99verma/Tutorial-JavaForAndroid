package com.example.tut2;

public class FossilFuelCar17 implements CarInterface17, TestInterface17 {

    private String name;

    public FossilFuelCar17(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in cylinder cause the engine to start");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + " mph");
    }

    @Override
    public void printName(String Name) {

    }
}
