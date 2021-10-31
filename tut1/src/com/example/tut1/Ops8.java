package com.example.tut1;

class Phone{
//    String name;
    private String name;
    int screenSize;
    int memoryRam;
    int camera;

    public void playMusic(String trackName) {
        System.out.println("Playing "+trackName);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}

 class Ops8 {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        //iPhone.name = "iPhone 11";
        iPhone.setName("iPhone 12");
        iPhone.memoryRam = 8;
        iPhone.playMusic("Shape of you");
//      System.out.println(iPhone.name+","+iPhone.memoryRam);
        System.out.println(iPhone.getName());
    }
}

//private: can access only inside class
//public: default any class can access
//protected:

//Encapsulation: we can bound to user either set or get value through encapsulation
