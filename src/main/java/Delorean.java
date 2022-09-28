public class Delorean extends Car {
    private String wings;
    public Delorean(String body, String chassis, String engine, String color, String driveTrain, String steeringsystem) {
        super(body, chassis, engine, color, driveTrain, steeringsystem);
        this.wings = wings;
    }

    public void canfly (){
        System.out.println("This car can fly");

    }
    public void canTimeTravel(){
        System.out.println("This car can Timetravel");

    }

    @Override
    public void typeofEngine(String typeofEngineV) {
        System.out.println("Has a super-advanced type of Engine");
        super.typeofEngine(typeofEngineV);
    }
}

