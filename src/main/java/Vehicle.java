public class Vehicle {
    private String body;
    private String chassis;
    private String engine;
    private int RunningGear;

    public Vehicle(String body, String chassis, String engine,  int RunningGear) {
        this.body = body;
        this.chassis = chassis;
        this.engine = engine;
        this.RunningGear = 1;
    }
    public String bodymaterial (String typeofmaterial) {
        System.out.println("body made of: " + typeofmaterial);
        return typeofmaterial;
    }
    public  void typeofEngine (String typeofEngineV){
        System.out.println("Engine: " + typeofEngineV);

    }
    public int numberofrunninggear (int number){
        System.out.println("Number of used running gear: " + number);
        return number;
    }

    public String getBody() {
        return body;
    }

    public String getChassis() {
        return chassis;
    }

    public String getEngine() {
        return engine;
    }



    public int getRunningGear() {
        System.out.println("Max running gear:" + RunningGear);
        return RunningGear;
    }
}