package com.example.tut1;

import java.util.Scanner;

class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean isOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color : "+ this.getColor());
    }

    public void open() {
        this.setOpen(true);
        System.out.println(this.getName()+ " Opened");
    }

    public void close() {
        this.setOpen(false);
        System.out.println(this.getName()+ " Closed");
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}

class Heart extends Organ{
    private int rate;

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate : "+ this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}

class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void digest(){
        System.out.println("Digesting begin...");
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()){
            System.out.println("Need to be fed");
        }else{
            System.out.println("Stomach is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}

class Skin extends Organ{
    private String color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Skin color : "+ this.getColor());
    }

    public String getColor() {
        return color;
    }
}

class Organ{
    private String name;
    private String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void getDetails(){
        System.out.println("Name : "+ this.getName());
        System.out.println("Medical Condition : "+ this.getMedicalCondition());
    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }
}

class Patient {
    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public Skin getSkin() {
        return skin;
    }

}

public class Exercies13
{
    public static void main(String[] args) {
        Patient patient = new Patient("Brad", 28,
                new Eye("Left Eye", "Short sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Blue", true),
                new Heart("Heart","Normal", 65),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned", "White", 40));

        System.out.println("Name : "+ patient.getName());
        System.out.println("Age : "+ patient.getAge());

        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish){
            System.out.println("Choose an Organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpen()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().close();
                        }else{
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().close();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpen()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().close();
                        }else{
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().close();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if(scanner.nextInt() == 1){
                        System.out.println("Enter the new Heart rate:");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate change to : "+ patient.getHeart().getRate());
                    }else{
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt() == 1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish =  true;
                    break;
            }
        }
    }
}
