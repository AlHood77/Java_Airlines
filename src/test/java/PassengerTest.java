import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Alan", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Alan", passenger.getName());
    }
    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.NumberOfBags());
    }


}
