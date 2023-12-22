package org.example;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati =new MotorBike();
        MotorBike honda =new MotorBike();

        ducati.start();
        ducati.setSpeed(100);
        honda.setSpeed(80);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        honda.start();
        honda.start();

        ducati.setSpeed(20);
        honda.setSpeed(0);
        ducati.increaseSpeeed(100);
        honda.increaseSpeeed(75);

        ducati.decreaseSpeeed(25);
        honda.decreaseSpeeed(12);


        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
