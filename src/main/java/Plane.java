import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType plane){
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();

    }

    public int PlaneCapacity() {
        return this.plane.getCapacity();
    }

    public int getWeight(){
        return this.plane.getWeight();
    }

    public int getPassengerSize(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        if (getPassengerSize() < plane.getCapacity()) {
            passengers.add(passenger);
        }
    }

    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }

    public void clearPlane(){
        passengers.clear();
    }



}



