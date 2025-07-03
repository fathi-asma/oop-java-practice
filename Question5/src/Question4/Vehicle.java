package Question4;

public class Vehicle {
    protected String vehicleID;
    protected String manufacturer;
    protected Engine engine;

    public Vehicle(String vehicleID, String manufacturer, Engine engine) {
        this.vehicleID = vehicleID;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }
    public void displayVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Manufacturer: " + manufacturer);
        engine.displayEngineDetails();
    }

}
class Engine {
    private String engineNumber;
     private double capacity;

    public Engine(String engineNumber, double capacity) {
        this.engineNumber = engineNumber;
        this.capacity = capacity;
    }
    public void displayEngineDetails() {
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Capacity: " + capacity);
    }

}

class Car extends Vehicle {
    private int numDoors;
    private String carType;

    public Car(String vehicleID, String manufacturer, Engine engine, int numDoors, String carType) {
        super(vehicleID, manufacturer, engine);
        this.numDoors = numDoors;
        this.carType = carType;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Car Type: " + carType);
    }

}

class Main{
    public static void main(String[] args) {
        Engine e1 = new Engine("ENG12345",2.0);
        Car c1 = new Car("V001","Toyota",e1,4,"Sedan");
        c1.displayVehicleDetails();

    }
}
