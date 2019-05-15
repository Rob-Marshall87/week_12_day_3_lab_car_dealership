package dealership.vehicle;

import dealership.vehicle.components.IElectricMotor;
import dealership.vehicle.components.IEngine;
import dealership.vehicle.components.IFuel;
import dealership.vehicle.components.IGearbox;

public class ICECar extends Vehicle implements IEngine, IFuel, IGearbox {

    private EngineSize volume;

    public ICECar(int price, ColourType colour, int costToRent, CarShape shape, TyreType tyres, int id, EngineSize volume) {
        super(price, colour, costToRent, shape, tyres, id);
        this.volume = volume;
    }


    @Override
    public double engineSize() {
        return volume.getVolume();
    }


}
