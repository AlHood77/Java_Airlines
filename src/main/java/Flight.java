import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType planeType, String flightNumber, String destination, String departureAirport, String departureTime ) {
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public PlaneType getPlane() {
        return planeType;
    }

    public String getFlightDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getFlightPassengerCount(){
        return passengers.size();
    }

    public void checkInPassenger(Passenger passenger) {
        if (getFlightPassengerCount() < getPlane().getCapacity()) {
            passengers.add(passenger);
        }
    }

    public int numberOfEmptySeats() {
        int emptySeats = getPlane().getCapacity() - getFlightPassengerCount();
        return emptySeats;
    }
}
