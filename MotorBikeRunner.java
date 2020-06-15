public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(-100);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(60);
        System.out.println(honda.getSpeed());

        ducati.increaseSpeed(50);
        honda.increaseSpeed(70);

        ducati.decreaseSpeed(1000);
        honda.decreaseSpeed(320);

    }


}
