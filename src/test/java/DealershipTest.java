import dealership.Dealership;
import dealership.vehicle.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership arnoldCodeClan;
    ICECar golf;

    @Before
    public void before(){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        arnoldCodeClan = new Dealership(55000, vehicles);
        golf = new ICECar(18000, ColourType.BLACK,45, CarShape.HATCHBACK, TyreType.ALL_SEASON, 53462543, EngineSize.TWO_LITRE);
    }

    @Test
    public void checkBuy(){
        arnoldCodeClan.buyANewVehicle(golf);
        assertEquals(1, arnoldCodeClan.getVehicles().size());
        assertEquals(37000, arnoldCodeClan.getTill());
    }

    @Test
    public void checkSell(){
        arnoldCodeClan.buyANewVehicle(golf);
        assertEquals( golf, arnoldCodeClan.sellAVehicle(golf.getId()));
        assertEquals(55000, arnoldCodeClan.getTill());
    }



}
