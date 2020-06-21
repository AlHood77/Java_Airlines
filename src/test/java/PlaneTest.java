import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        plane = new Plane(PlaneType.CESSNA);
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(4, plane.PlaneCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(200, plane.getWeight());
    }

    @Test
    public void passengerListStartsEmpty(){
        assertEquals(0, plane.getPassengerSize());
    }

    @Test
    public void canAddPassengertoPlane(){
        plane.addPassenger(passenger1);
        assertEquals(1, plane.getPassengerSize());
    }


}
