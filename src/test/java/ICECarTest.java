import dealership.vehicle.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ICECarTest {

    ICECar golf;

    @Before
    public void before(){
        golf =  new ICECar(18000, ColourType.BLACK,45, CarShape.HATCHBACK, TyreType.ALL_SEASON, 234532, EngineSize.TWO_LITRE);
    }

    @Test
    public void hasPrice() {
        assertEquals(18000, golf.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals(ColourType.BLACK, golf.getColour());
    }

    @Test
    public void hasCostPerDay(){
        assertEquals(45, golf.getCostToRent());
    }

    @Test
    public void costPerWeek(){
        assertEquals(315, golf.totalCostPerRent(7));
    }

    @Test
    public void hasShape(){
        assertEquals(CarShape.HATCHBACK, golf.getShape());
    }

    @Test
    public void hasDoors(){
        assertEquals(3, golf.numberOfDoors());
    }

    @Test
    public void hasEngineVolume(){
        assertEquals(2.00, golf.engineSize(), 0.01);
    }
}
