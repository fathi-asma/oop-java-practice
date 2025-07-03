package Question5PartB;

public class Main {
    public static void main(String[] args) {
        Vehicle.setRegistrationYear(2025);

        Vehicle v1 = new Vehicle("V001","Toyota Corolla","Alice");
        Vehicle v2 = new Vehicle("v002","Honda Civic","Bob");
        Vehicle v3 = new Vehicle("V003","Ford Focus","Charlie");

        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        vehicleRegistry.addVehicle(v1);
        vehicleRegistry.addVehicle(v2);
        vehicleRegistry.addVehicle(v3);

        vehicleRegistry.displayAllVehicles();


    }
}
