package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal =new Animal("Animal",1,1,5,5);
        Dog dog =new Dog("Sheerry",8,25,2,4,1,32,"Silk");
        Fish fish =new Fish("Gold Fish",1,1,10,30,1,2,1);
        dog.eat();
        dog.walk();
        dog.run();
        fish.move(10);
        fish.swim();
    }
}
