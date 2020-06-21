public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }

    public int getPlaneCapacity() {
        return this.plane.getCapacity();
    }

    public int getWeight(){
        return this.plane.getWeight();
    }
}
