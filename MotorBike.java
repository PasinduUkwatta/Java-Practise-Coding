package org.example;

public class MotorBike {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        System.out.println(speed);
        System.out.println(this.speed);
        this.speed = speed;
    }


    public void increaseSpeeed(int howMuch){
        this.speed =this.speed+howMuch;
    }

    public void decreaseSpeeed(int howMuch){
        if(this.speed>howMuch){
            this.speed =this.speed-howMuch;

        }
        else {
            this.speed =0;
        }

    }
    void start(){
        System.out.println("Bike started");
    }

}
