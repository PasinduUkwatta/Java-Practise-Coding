package org.example;

public class FlyableRunner {
    public static void main(String[] args) {
        Fiyable aeropalne =new Aeroplane();
        Fiyable bird =new Bird();

        Fiyable[] flyble ={new Aeroplane(),new Bird()};

        aeropalne.fly();
        bird.fly();

        for (Fiyable animal:flyble){
            animal.fly();
        }
    }
}
