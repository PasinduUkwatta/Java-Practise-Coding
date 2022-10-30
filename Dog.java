package com.company;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Dog eat method called");
    }

    public void walk(){
        System.out.println("Dog walk");
        move(5);
    };
    public void run(){
        System.out.println("Dog run");
       move(10);
    };
}
