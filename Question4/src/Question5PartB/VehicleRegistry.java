package Question5PartB;

import java.util.ArrayList;

public class VehicleRegistry {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles ) {
            vehicle.displayInfo();
        }
    }
}
