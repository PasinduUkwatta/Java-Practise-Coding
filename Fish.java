package com.company;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    public void swim(){
      moveMuscles();
      moveBackFin();
      move(10);
    }

    public void moveMuscles(){
        System.out.println("Fish move muscles method called");
    }

    public void moveBackFin(){
        System.out.println("Fish move back fin method called");

    }

}
