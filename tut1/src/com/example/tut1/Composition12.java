package com.example.tut1;

class Engine{
    private String model;
    private int rpm;

    public Engine(String model, int rpm) {
        this.model = model;
        this.rpm = rpm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}

class Car {
    private String name;
    private int doors;
    private String color;
    private Engine engine;            //import Engine class

    public Car(String name, int doors, String color, Engine engine) {
        this.name = name;
        this.doors = doors;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

public class Composition12
{
    public static void main(String[] args) {

//        Engine engine = new Engine("Renault", 8000);
//        Car mercedes = new Car("Mercedes AMG", 2,"Silver", engine);
//or
        Car mercedes = new Car("Mercedes AMG", 2,"Silver", new Engine("Renault", 8000));
        System.out.println("Name : "+mercedes.getName());
        System.out.println("Engine Model : "+ mercedes.getEngine().getModel());        //ctr+q
//null
        Car tata = null;
        if(tata != null){
            tata.getName();
        }else{
            System.out.println("The car was null");
        }
//final
        final Engine engine = new Engine("Nissan", 8000);
        //engine = new Engine("Nissan", 7000)
        // whe u decliear final ur object then u can not change the instance of ur whole object but u can change property of object
        engine.setRpm(10000);
    }
}

//Composition: this way of using different classes inside other classes is called composition