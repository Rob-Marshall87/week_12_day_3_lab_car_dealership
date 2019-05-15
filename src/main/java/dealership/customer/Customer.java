package dealership.customer;

import dealership.Dealership;
import dealership.vehicle.Vehicle;

public class Customer {

    private int wallet;
    private Vehicle car;

    public Customer(int wallet) {
        this.wallet = wallet;
        this.car = null;
    }

    public int getWallet() {
        return wallet;
    }

    public Vehicle getCar() {
        return car;
    }

    public void addCar(Vehicle car) {
        this.car = car;
    }

    public Vehicle buyCar(Dealership dealership, Vehicle car){
        int id = car.getId();
        dealership.sellAVehicle(id);
    }
}
