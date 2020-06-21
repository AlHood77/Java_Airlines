import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane1;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;


    @Before
    public void setUp() {
        plane1 = new Plane(PlaneType.CESSNA);
        flight = new Flight(PlaneType.CESSNA, "BA8", "London", "Edinburgh", "1000");
        passenger1 = new Passenger("Alan", 2);
        passenger2 = new Passenger("Dave", 1);
        passenger3 = new Passenger("Paul", 2);
        passenger4 = new Passenger("Brian", 1);
        passenger5 = new Passenger("Hazel", 3);
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.CESSNA, flight.getPlane());
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
    public void canGetNumberOfPassengersOnFlight_startsEmpty(){
        flight = new Flight(PlaneType.CESSNA, "BA1", "Madrid", "Edinburgh", "1400" );
        assertEquals(0, flight.getFlightPassengerCount());
    }

    @Test
    public void canCheckInPassengerOnFlight_ifSeatsAvailable(){
        flight = new Flight(PlaneType.CESSNA, "BA1", "Madrid", "Edinburgh", "1400" );
        flight.checkInPassenger(passenger1);
        assertEquals(1, flight.getFlightPassengerCount());
    }

    @Test
    public void canCheckInPassengerOnFlight_ifAtCapacity(){
        flight = new Flight(PlaneType.CESSNA, "BA1", "Madrid", "Edinburgh", "1400" );
        flight.checkInPassenger(passenger1);
        flight.checkInPassenger(passenger2);
        flight.checkInPassenger(passenger3);
        flight.checkInPassenger(passenger4);
        assertEquals(4, flight.getFlightPassengerCount());
    }

    @Test
    public void canCheckInPassengerOnFlight_ifOverCapacity(){
        flight = new Flight(PlaneType.CESSNA, "BA1", "Madrid", "Edinburgh", "1400" );
        flight.checkInPassenger(passenger1);
        flight.checkInPassenger(passenger2);
        flight.checkInPassenger(passenger3);
        flight.checkInPassenger(passenger4);
        flight.checkInPassenger(passenger5);
        assertEquals(4, flight.getFlightPassengerCount());
    }

    @Test
    public void canGetNumberOfEmptySeats(){
        flight = new Flight(PlaneType.CESSNA, "BA3", "Oslo", "Edinburgh", "1500" );
        flight.checkInPassenger(passenger1);
        flight.checkInPassenger(passenger2);
        assertEquals(2, flight.numberOfEmptySeats());
    }




}
