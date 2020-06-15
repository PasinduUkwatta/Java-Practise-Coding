public class MotorBike {
    private int speed;

    void start(){
        System.out.println("Bike is started");
    }

    void increaseSpeed(int howMuch){
        speed = speed+howMuch;
        System.out.println(speed);
    }

    void decreaseSpeed(int howMuch){
        speed=speed-howMuch;
        if(speed<0){
            System.out.println(0);
        }else{
            System.out.println(speed);
        }

    }

    //encapsulation helps us to enter wrong values to the programe
    //we can validate the data
    public void setSpeed(int speed) {
        if(speed>0) {
            this.speed = speed;
        }else {
            this.speed = 0;
        }

    }

    public int getSpeed() {
        return speed;
    }
}
