package dealership.vehicle;

import dealership.vehicle.components.IDoors;
import dealership.vehicle.components.IGearbox;
import dealership.vehicle.components.ITyres;

import java.util.Collection;

public abstract class Vehicle implements ITyres, IDoors, IGearbox {

    private int price;
    private ColourType colour;
    private int costToRent;
    private CarShape shape;
    private TyreType tyres;
    private int id;

    public Vehicle(int price, ColourType colour, int costToRent, CarShape shape, TyreType tyres, int id) {
        this.price = price;
        this.colour = colour;
        this.costToRent = costToRent;
        this.shape = shape;
        this.tyres = tyres;
        this.id = id;
    }


    public int getPrice() {
        return price;
    }

    public ColourType getColour() {
        return colour;
    }

    public int getCostToRent() {
        return costToRent;
    }

    public int totalCostPerRent(int numberOfDays){
        return costToRent * numberOfDays;
    }


    public int numberOfDoors(){
        return shape.getDoors();
    }

    public TyreType getTyres() {
        return tyres;
    }

    public Boolean checkTyresSafe() {
        return null;
    }

    public CarShape getShape() {
        return shape;
    }

    public int getId() {
        return id;
    }
}
