public class Car extends Vehicle {
    private String color;
    private String driveTrain;
    private  String steeringsystem;

    public Car(String body, String chassis, String engine, String color, String driveTrain, String steeringsystem) {
        super(body, chassis, engine, 1);
        this.color = color;
        this.driveTrain = driveTrain;
        this.steeringsystem = steeringsystem;

    }
    public int speed (int s) {
        if ( s >= 70 ) {
            System.out.println("Speed " + s + " so your speed is high!");}
        else { System.out.println("Speed " + s + " so your speed is ok.");}
        return s;
    }
    @Override
    public int numberofrunninggear(int number) {

        if (number>2){
            System.out.println("Your speed is over 30.");
        }
        return super.numberofrunninggear(number);

    }


}

