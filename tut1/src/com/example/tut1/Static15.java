package com.example.tut1;

class Test{
    public static String name;
    public int age;
    public String skinColor;

    public Test(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public static void printSomething() {
        System.out.println("Printing...");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Test.name = name;
        //System.out.println(age);  //non-static variable can not access inside static method
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
public class Static15
{
    public static void main(String[] args) {
        Test.name = "Ajai";
        Test test = new Test(25, "White");
//        without instantiating object we can assign value to this variable
//        test.setName("Nidhi");
        System.out.println("Name : "+test.getName());
        System.out.println("Age : "+test.getAge());

        Test test2 = new Test(30, "Brown");
        System.out.println("Name : "+ test2.name);

        Test.printSomething();
    }
}

//static : if variable or method is static then this method or variable belong to the object itself not instance of object.
//static variable: for constaint value for all object