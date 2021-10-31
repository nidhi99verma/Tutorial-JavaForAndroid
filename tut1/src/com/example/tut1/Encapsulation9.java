package com.example.tut1;

class Mobile{
    private String name;
    private int screenSize;
    private int memoryRam;
    private int camera;

    //polymorphism
    public Mobile(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public Mobile(String name, int camera) {
        this.name = name;
        this.camera = camera;
    }
    //

    public void playMusic(String trackName) {

        System.out.println("Playing "+trackName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}

public class Encapsulation9
{
    public static void main(String[] args)
    {
//        Mobile iPhone = new Mobile();
//
//        iPhone.playMusic("Shape of you!");
//
//        iPhone.setName("iPhone 12 pro");
//        System.out.println(iPhone.getName());
//
//        iPhone.setScreenSize(1000);
//        System.out.println(iPhone.getScreenSize());
//
//        iPhone.setMemoryRam(500);
//        System.out.println(iPhone.getMemoryRam());
//
//        iPhone.setCamera(16);
//        System.out.println(iPhone.getCamera());

        //or

        Mobile iPhone = new Mobile("iPhone 13", 5, 8, 8);
        System.out.println(iPhone.getName());
        System.out.println(iPhone.getScreenSize());
        System.out.println(iPhone.getMemoryRam());
        System.out.println(iPhone.getCamera());

        Mobile Android = new Mobile("OnePlus",  16);
        System.out.println(Android.getName());
        System.out.println(Android.getCamera());
    }
}

//Encapsulation : he major advantage of encapsulation in Java is data hiding. Using encapsulation we can allow the programmer to decide on the
//access to data and methods operating on that data. For example, if we want a particular piece of data to be inaccessible to anyone outside the
// class, then we make that data private

//polymorphism: The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be
// displayed in more than one form. ... Polymorphism is considered one of the important features of Object-Oriented Programming. Polymorphism
// allows us to perform a single action in different ways.

//polymorphism: having 2 types of constructor called polymorphism