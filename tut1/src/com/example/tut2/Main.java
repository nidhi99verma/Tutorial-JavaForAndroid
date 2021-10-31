package com.example.tut2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Interface                   Class
        CarInterface17 carInterface = new ElectricCar17("Tesla");
        carInterface.start();
        carInterface.move(60);
        //List<String> names =  new ArrayList<>();

        CarInterface17 fossilCarInterface = new FossilFuelCar17("Mercedes");
        fossilCarInterface.start();
        fossilCarInterface.move(100);
    }
}

//call back Interface: useful in creating connection between two interface
