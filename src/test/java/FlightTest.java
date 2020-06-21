import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void setUp() {
        flight = new Flight(PlaneType.CESSNA, "BA8", "London", "Edinburgh", "1000");
        passenger1 = new Passenger("Alan", 2);
        passenger2 = new Passenger("Dave", 1);
        passenger3 = new Passenger("Paul", 2);
        passenger4 = new Passenger("Brian", 1);
        passenger5 = new Passenger("Hazel", 3);
    }

    @Test
    public void flightHasPlaneType(){
        assertEquals(PlaneType.CESSNA, flight.getPlaneType());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("BA8", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("London", flight.getFlightDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }
    @Test
    public void flightHasDepartureTime(){
        assertEquals("1000", flight.getDepartureTime());
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.getFlightPassengerCount());
    }



}
