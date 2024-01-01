package org.example;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal [] animals ={new Cat(),new Dog()};
        Animal dog =new Dog();
        Animal cat =new Cat();

        dog.bark();
        cat.bark();

        for (Animal animal:animals){
            animal.bark();
        }
    }
}
