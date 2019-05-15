package dealership;

import dealership.vehicle.ICECar;
import dealership.vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(int till, ArrayList<Vehicle> vehicles) {
        this.till = till;
        this.vehicles = new ArrayList<>();
    }

    public void buyANewVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        this.till -= vehicle.getPrice();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getTill() {
        return till;
    }

    public Vehicle sellAVehicle(int id) {
        Vehicle customerVehicle = null;
        int index = 0;
        for (Vehicle vehicle : vehicles)
            if (vehicle.getId() == id) {
                index = vehicles.indexOf(vehicle);
            }
        customerVehicle = vehicles.remove(index);
        till += customerVehicle.getPrice();
        return customerVehicle;
    }
}
