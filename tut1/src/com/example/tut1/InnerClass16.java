package com.example.tut1;

//it(outer) can not be private or static class
class TestClass{
    private int age;
    private String color;

    private class TestInnerClass{
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        private void printAge() {
            System.out.println("Age : "+ age); //age  is accessible in this class
        }
    }
}

public class InnerClass16
{
    public static void main(String[] args) {

    }
}
