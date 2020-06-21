import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

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
    public void canAddPassengertoPlane_underCapacity(){
        plane.addPassenger(passenger1);
        assertEquals(1, plane.getPassengerSize());
    }

    @Test
    public void canAddPassengertoPlane_atCapacity(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger3);
        plane.addPassenger(passenger4);
        assertEquals(4, plane.getPassengerSize());
    }
    @Test
    public void canAddPassengertoPlane_overCapacity(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger3);
        plane.addPassenger(passenger4);
        plane.addPassenger(passenger5);
        assertEquals(4, plane.getPassengerSize());
    }

    @Test
    public void canRemovePassengerFromPlane(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.removePassenger(passenger2);
        assertEquals(1, plane.getPassengerSize());
    }

    @Test
    public void canRemoveAllPassengersFromPlane(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.clearPlane();
        assertEquals(0, plane.getPassengerSize());
    }


}
