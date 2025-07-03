package Question5PartB;

public class Vehicle implements Registrable {
    private String vehicleID;
    private String model;
    private String owner;
    static int registrationYear;

    public Vehicle(String vehicleID, String model, String owner) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.owner = owner;
    }

    public static void setRegistrationYear(int year) {
        Vehicle.registrationYear = year;
    }

    @Override
    public String getVehicleID() {
        return vehicleID;
    }

    @Override
    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Model: " + model);
        System.out.println("Owner: " + owner);
        System.out.println("Register year: " + registrationYear);
        System.out.println("---------------------------------------");

    }
}
